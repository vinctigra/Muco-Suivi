package com.app.muco.dal.jdbc;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.muco.bo.Patient;
import com.app.muco.dal.ConnectionProvider;
import com.app.muco.dal.DalException;
import com.app.muco.dal.PatientDao;
import com.app.muco.dal.Utils;


public class PatientDaoJdbcImpl implements PatientDao{

	@Override
	public Patient insert(Patient patient) throws DalException, SQLException {
		Patient patientRetourner = new Patient();
		String INSERT_PATIENT = "INSERT INTO PATIENTS (nom,prenom,email,motDePasse)  VALUES (?,?,?,?)";
		int idAjout = 0;
		
		try (Connection connection = Utils.getConnection()){
			PreparedStatement requete = connection.prepareStatement(INSERT_PATIENT, PreparedStatement.RETURN_GENERATED_KEYS);
			requete.setString(1, patient.getNom());
			requete.setString(2, patient.getPrenom());
			requete.setString(3, patient.getEmail());
			requete.setString(4, patient.getMotDePasse());
			requete.executeUpdate();
			ResultSet rs = requete.getGeneratedKeys();
			if (rs.next()) {
		        idAjout = rs.getInt(1);
		        patientRetourner = selectById(idAjout);
		      }
		}catch(DalException e) {
			e.printStackTrace();
			throw new DalException("erreur lors de l'insertion du patient insert" + e);
		}
		return patientRetourner;
	}
	
	

	@Override
	public Patient selectById(int id) throws DalException, SQLException {
		Patient patientRetourner = new Patient();
		String SELECT_BY_ID = "SELECT * FROM PATIENTS WHERE id = ? ";
		try(Connection connection = Utils.getConnection()){
			PreparedStatement requete = connection.prepareStatement(SELECT_BY_ID);
			requete.setInt(1, id);
			ResultSet rs = requete.executeQuery();
			if(rs.next()) {
				patientRetourner.setId(rs.getInt("id"));
				patientRetourner.setNom(rs.getString("nom"));
				patientRetourner.setPrenom(rs.getString("prenom"));
				patientRetourner.setEmail(rs.getString("email"));
				patientRetourner.setMotDePasse(rs.getString("motDePasse"));
				patientRetourner.setSante(rs.getInt("sante"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DalException("erreur lors de la selection du patient selectById" + e);
		}
		return patientRetourner;
	}

}
