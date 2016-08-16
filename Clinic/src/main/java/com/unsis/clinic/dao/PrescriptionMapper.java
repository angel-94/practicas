package com.unsis.clinic.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.unsis.clinic.model.Prescription;

public class PrescriptionMapper implements RowMapper<Prescription>{

	@Override
	public Prescription mapRow(ResultSet rs, int rowNum) throws SQLException {
		Prescription prescription = new Prescription();
		prescription.setPrescriptionId(rs.getInt("PrescriptionId"));
		return null;
	}

}
