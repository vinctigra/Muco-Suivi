package com.app.muco.dal;

import com.app.muco.dal.jdbc.PatientDaoJdbcImpl;

public class FactoryDao {
	public static PatientDao getInstance() {
		return new PatientDaoJdbcImpl();
	}

}
