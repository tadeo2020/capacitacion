package com.mx.proyecto.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.proyecto.Dto.Maestros;
import com.mx.proyecto.Mapper.MaestrosListMapper;
import com.mx.proyecto.Repository.RepositoryMaestros;

@Repository
public class RepositoryMaestrosImpl implements RepositoryMaestros {

	@Autowired
	private DataSource dataSoure;
	JdbcTemplate jdbcTemplate = new JdbcTemplate();

	@Override
	public List<Maestros> getMaestros() {
		jdbcTemplate.setDataSource(getDataSoure());
		return jdbcTemplate.query("SELECT * FROM MAESTROS", new MaestrosListMapper<Maestros>());
	}

	@Override
	public Integer insertMaestros(Maestros maestro) {
		jdbcTemplate.setDataSource(getDataSoure());
		return jdbcTemplate.update(
				"INSERT INTO MAESTROS(ID_MAESTROS,NOMBRE,EDAD,SALARIO,FECHA_NACIMIENTO,DIRECCION,FECHA_INGRESO,GRUPO)VALUES(?,?,?,?,?,?,?,?)",

				maestro.getIdmaestro(), maestro.getNombre(), maestro.getEdad(), maestro.getSalario(),
				maestro.getFechaNacimiento(), maestro.getDireccion(), maestro.getFechaIngreso(), maestro.getGrupo());
		////// termina metodo isert into

	}

/////comienza metodo update
	@Override
	public Integer updateMaestros(Maestros maestro) {
		jdbcTemplate.setDataSource(getDataSoure());
		return jdbcTemplate.update(
				"UPDATE MAESTROS(SET NOMBRE=?, SET EDAD= ?,SET SALARIO= ?,SET FECHA_NACIMIENTO= ?,SET DIRECCION= ?,WHERE ID_MAESTRO= ?",
				maestro.getNombre(), maestro.getEdad(), maestro.getSalario(), maestro.getFechaNacimiento(),
				maestro.getDireccion(), maestro.getIdmaestro());
	}
/////////termina update
	//////empieza metodo delete
	
	@Override
	public Integer deleteMaestros(Maestros maestro) {
			jdbcTemplate.setDataSource(getDataSoure());
		return jdbcTemplate.update("DELETE FROM MAESTROS WHERE ID_SUPERVISOR = ? ",maestro.getIdmaestro());
	}

	public DataSource getDataSoure() {
		return dataSoure;
	}

	public void setDataSoure(DataSource dataSoure) {
		this.dataSoure = dataSoure;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
