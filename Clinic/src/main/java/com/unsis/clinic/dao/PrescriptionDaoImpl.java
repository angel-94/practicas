/**
 * Copyright 2016 the original author.
 */
package com.unsis.clinic.dao;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.unsis.clinic.model.Prescription;

/**
 * 
 * @author meltsansolutions
 * @version 1.0
 *
 */
public class PrescriptionDaoImpl implements PrescriptionDao {

	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(PrescriptionDaoImpl.class);

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Método para insertar los datos de la receta en la base de datos.
	 */
	@Override
	public void insertPrescription(Prescription prescription) {
		logger.info("Insertar los datos de la receta medica: En el DAO");
		String query = "INSERT INTO EMPLOYEE VALUES();";
		jdbcTemplate.update(query);
	}

	/**
	 * Método para obtener información de todas las recetas de la base de datos.
	 */
	@Override
	public List<Prescription> getAllPrescription() {
		logger.info("Obteniendo todas las recetas de la BD: En el DAO");
		return null;
	}

	/**
	 * Método para obtener una receta por su id.
	 */
	@Override
	public Prescription getPrescriptionById(int id) {
		logger.info("Obteniendo una receta por su id: En el DAO");
		return null;
	}

}
