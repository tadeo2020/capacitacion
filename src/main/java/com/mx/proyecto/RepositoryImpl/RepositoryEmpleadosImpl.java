package com.mx.proyecto.RepositoryImpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mx.proyecto.Dto.Empleados;
import com.mx.proyecto.Mapper.EmpleadosListMapper;
import com.mx.proyecto.Repository.RepositoryEmpleados;

@Repository
public class RepositoryEmpleadosImpl implements RepositoryEmpleados{
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	@Override
	public List<Empleados> getEmpleados() {
		jdbcTemplate.setDataSource(getDataSource());//LA CONEXION SE LE ASIGNA AL JDBC TEMPLATE PARA QUE SEPA
		// A QUE BASE DE DATOS VA A EJECUTAR LAS CONSULTAS
		System.out.println("Llegando al metodo getEmpleados de la clase RepositoryEmpleadosImpl");
		return jdbcTemplate.query("SELECT * FROM EMPLEADOS", new EmpleadosListMapper<Empleados>());
	}
	
	@Override
	public Integer insertEmpleados(Empleados empleado) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("INSERT INTO CAPACITACION1.EMPLEADOS(ID_EMPLEADO, NOMBRE, DIRECCION, FECHA_NACIMIENTO, EDAD, SALARIO, OCUPACION) VALUES(?, ?, ?, ?, ?, ?, ?)",
				empleado.getIdEmpleados(), empleado.getNombre(), empleado.getDireccion(), empleado.getFechaNacimiento(), empleado.getEdad(), empleado.getSalario(), empleado.getOcupacion());
	}
	
	@Override
	public Integer updateEmpleado(Empleados empleado) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("UPDATE CAPACITACION1.EMPLEADOS SET NOMBRE = ?, DIRECCION = ?, FECHA_NACIMIENTO = ?, EDAD = ?, SALARIO = ?, OCUPACION = ? WHERE ID_EMPLEADO = ?"
				, new Object[] {empleado.getNombre(), empleado.getDireccion(), empleado.getFechaNacimiento(), empleado.getEdad(), empleado.getSalario(), empleado.getOcupacion(), empleado.getIdEmpleados()});
				//new Objetc es solo otra forma de agregar valores a como se utilizo en el metodo anterior. Aqui se agrego new Objetc
	}
	
	@Override
	public Integer deleteEmpleado(Empleados empleado) {
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.update("DELETE FROM CAPACITACION1.EMPLEADOS WHERE ID_EMPLEADO = ? "
				, new Object[] {empleado.getIdEmpleados()});
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
