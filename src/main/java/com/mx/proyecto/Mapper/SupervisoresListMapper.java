package com.mx.proyecto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.mx.proyecto.Dto.Supervisores;

public class SupervisoresListMapper<T> implements RowMapper<Supervisores> {

	@Override
	public Supervisores mapRow(ResultSet rs, int rowNum) throws SQLException {
		Supervisores Supervisor = new Supervisores();
		
		Supervisor.setIdSupervisores(rs.getLong("ID_SUPERVISOR"));
		Supervisor.setNombre(rs.getString("NOMBRE"));
		Supervisor.setEdad(rs.getInt("EDAD"));
		Supervisor.setSalario(rs.getDouble("SALARIO"));
		Supervisor.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
		Supervisor.setDireccion(rs.getString("DIRECCION"));
		Supervisor.setPuesto(rs.getString("PUESTO"));
		Supervisor.setFechaIngreso(rs.getDate("FECHA_INGRESO"));
		
	//sepervisor.setSexo(rs.getChar("SEXO"));
		return Supervisor;
	}
	
	

}
