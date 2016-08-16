package com.unsis.clinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.unsis.clinic.dao.PrescriptionDao;
import com.unsis.clinic.model.Prescription;

public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	private PrescriptionDao prescriptionDao;
	
	@Override
	public void insertPrescription(Prescription prescription) {
		prescriptionDao.insertPrescription(prescription);
	}

	@Override
	public List<Prescription> getAllPrescription() {
		return prescriptionDao.getAllPrescription();
	}

	@Override
	public Prescription getPrescriptionById(int id) {
		return prescriptionDao.getPrescriptionById(id);
	}

}
