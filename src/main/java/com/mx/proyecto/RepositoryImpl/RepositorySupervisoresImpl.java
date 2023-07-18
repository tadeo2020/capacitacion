package com.mx.proyecto.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.proyecto.Dto.Supervisores;
import com.mx.proyecto.Mapper.SupervisoresListMapper;
import com.mx.proyecto.Repository.RepositorySupervisores;

@Repository
public class RepositorySupervisoresImpl implements RepositorySupervisores {

	@Autowired
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	////// despues de crear el Jdbc Template se agregan lo getters y setters//// de
	////// Jdbc y data Source//////
	@Override /////// agregregar metodos no implementados se alinean no los de otros metodos
	public List<Supervisores> getSupervisores() {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.query("SELECT * FROM SUPERVISORES", new SupervisoresListMapper<Supervisores>());
	}///// 7implementacion de los metodos

	@Override
	public Integer insertSupervisores(Supervisores supervisor) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update(
				"INSERT INTO SUPERVISORES (ID_SUPERVISOR,NOMBRE,EDAD,SALARIO,FECHA_NACIMIENTO,DIRECCION,PUESTO,FECHA_INGRESO) VALUES(?,?,?,?,?,?,?,?)",
				supervisor.getIdSupervisores(), supervisor.getNombre(), supervisor.getEdad(), supervisor.getSalario(),
				supervisor.getFechaNacimiento(), supervisor.getDireccion(), supervisor.getPuesto(),
				supervisor.getFechaIngreso());
	}

	@Override
	public Integer updateSupervisores(Supervisores supervisor) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE SUPERVISORES SET NOMBRE= ?, EDAD=?, SALARIO=? WHERE ID_SUPERVISOR = ? ",
				supervisor.getNombre(), supervisor.getEdad(), supervisor.getSalario(), supervisor.getIdSupervisores());
	}

	// metodo para borrar por id
	@Override
	public Integer deleteSupervisores(Supervisores supervisor) {
		jdbcTemplate.setDataSource(getDataSource());

		return jdbcTemplate.update("DELETE FROM SUPERVISORES WHERE ID_SUPERVISOR = ? ", supervisor.getIdSupervisores());
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

///////@Repository hai es donde se van a relizar las consultas a la base de datos/////////////

//////Data Source es para la informacion a la base de datos y Jdbc Template para vincular ///////