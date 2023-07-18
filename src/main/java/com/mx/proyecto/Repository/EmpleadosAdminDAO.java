package com.mx.proyecto.Repository;

import java.util.List;

import com.mx.proyecto.Entity.EmpleadosAdmin;

public interface EmpleadosAdminDAO {

	List<EmpleadosAdmin> obtenerTodosEmpleados();
	
	Integer InsertarEmpleados(EmpleadosAdmin datos);
}
