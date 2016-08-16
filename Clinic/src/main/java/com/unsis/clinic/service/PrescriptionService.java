package com.unsis.clinic.service;

import java.util.List;

import com.unsis.clinic.model.Prescription;

public interface PrescriptionService {
	
	void insertPrescription(Prescription prescription);

	List<Prescription> getAllPrescription();

	Prescription getPrescriptionById(int id);
}
