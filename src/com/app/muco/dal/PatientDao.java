package com.app.muco.dal;

import java.sql.SQLException;

import com.app.muco.bo.Patient;

public interface PatientDao {
	Patient insert(Patient patient) throws DalException, SQLException;
	Patient selectById(int id) throws DalException, SQLException;

}
