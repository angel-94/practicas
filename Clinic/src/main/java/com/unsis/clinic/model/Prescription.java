package com.unsis.clinic.model;

import java.util.Date;

public class Prescription {
	private int PrescriptionId;
	private int IdentityCard;
	private Date DateCreated;
	private String NamePatient;
	private int AgePatient;
	private String Prescription;

	public Prescription() {
		super();
	}

	public Prescription(int prescriptionId, int identityCard, Date dateCreated, String namePatient, int agePatient,
			String prescription) {
		super();
		PrescriptionId = prescriptionId;
		IdentityCard = identityCard;
		DateCreated = dateCreated;
		NamePatient = namePatient;
		AgePatient = agePatient;
		Prescription = prescription;
	}

	public int getPrescriptionId() {
		return PrescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		PrescriptionId = prescriptionId;
	}

	public int getIdentityCard() {
		return IdentityCard;
	}

	public void setIdentityCard(int identityCard) {
		IdentityCard = identityCard;
	}

	public Date getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		DateCreated = dateCreated;
	}

	public String getNamePatient() {
		return NamePatient;
	}

	public void setNamePatient(String namePatient) {
		NamePatient = namePatient;
	}

	public int getAgePatient() {
		return AgePatient;
	}

	public void setAgePatient(int agePatient) {
		AgePatient = agePatient;
	}

	public String getPrescription() {
		return Prescription;
	}

	public void setPrescription(String prescription) {
		Prescription = prescription;
	}

}
