package TEST;

import java.sql.SQLException;
import java.util.logging.Logger;

import com.app.muco.bo.Patient;
import com.app.muco.dal.DalException;
import com.app.muco.dal.FactoryDao;
import com.app.muco.dal.PatientDao;
import com.app.muco.dal.jdbc.PatientDaoJdbcImpl;


public class test {
	
	//TEST TDD
	public static void main(String[] args) throws DalException, SQLException {
		Patient patient = new Patient("colas","vincent","test@test.com","Pa$$w0rd");
		Patient patientRetourner = null;
		
		PatientDao patientDao = FactoryDao.getInstance();
		
		//patientRetourner = patientDao.insert(patient);
		patientRetourner = patientDao.selectById(1);
		System.out.println(patientRetourner.getNom() + " " + patientRetourner.getPrenom() + " " + patientRetourner.getEmail() + " " + patientRetourner.getMotDePasse());

	}

}
