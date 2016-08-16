package com.unsis.clinic.dao;

import java.util.List;

import javax.sql.DataSource;

import com.unsis.clinic.model.Prescription;

public interface PrescriptionDao {
	
	void setDataSource(DataSource dataSource);
	
	void insertPrescription(Prescription prescription);

	List<Prescription> getAllPrescription();

	Prescription getPrescriptionById(int id);
}
