package com.app.muco.bll;

import java.sql.SQLException;

import com.app.muco.bo.Patient;
import com.app.muco.dal.DalException;
import com.app.muco.dal.FactoryDao;
import com.app.muco.dal.PatientDao;

public class PatientManager {
	private static PatientManager instance;
    private PatientDao patientDao;
    
    private PatientManager() {patientDao = FactoryDao.getInstance();}
    
    public static PatientManager getInstance() {
    	if(instance == null) {
    		return new PatientManager();
    	}
    	return instance;
    }
    
    
    public Patient insert(Patient patient) throws BllException, SQLException{
    	Patient patientRetourner = new Patient();
    	try {
    		patientRetourner = patientDao.insert(patient);
    	}catch(DalException e) {
    		e.printStackTrace();
    		throw new BllException("Erreur lors de l'insertion du membre " + e);
    	} 
		return patientRetourner;
    	
    }
    public Patient selectById(int id) throws BllException, SQLException {
       	Patient patientRetourner = new Patient();
       	try {
       		patientRetourner = patientDao.selectById(id);
       	}catch(DalException e) {
       		e.printStackTrace();
    		throw new BllException("Erreur lors de la selection du membre " + e);
       	}
		return patientRetourner;
    	
    }
}
