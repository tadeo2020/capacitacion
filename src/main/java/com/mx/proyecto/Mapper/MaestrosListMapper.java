package com.mx.proyecto.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mx.proyecto.Dto.Maestros;

public class MaestrosListMapper<T> implements RowMapper<Maestros> {

	@Override
	public Maestros mapRow(ResultSet rs, int rowNum) throws SQLException {
		Maestros maestro = new Maestros();
		maestro.setIdmaestro(rs.getLong("ID_MAESTROS"));
		maestro.setNombre(rs.getString("NOMBRE"));
		maestro.setEdad(rs.getInt("EDAD"));
		maestro.setSalario(rs.getDouble("SALARIO"));
		maestro.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO"));
		maestro.setDireccion(rs.getString("DIRECCION"));
		maestro.setFechaIngreso(rs.getDate("FECHA_INGRESO"));
		maestro.setGrupo(rs.getString("GRUPO"));
		maestro.setGrado(rs.getString("GRADO"));
		maestro.setMateria(rs.getString("MATERIA"));
		
		
		return maestro;
	}

	
}
