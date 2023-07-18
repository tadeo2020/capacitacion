package com.mx.proyecto.Repository;

import java.util.List;

import com.mx.proyecto.Dto.Empleados;

public interface RepositoryEmpleados {
	
	List<Empleados> getEmpleados();
	
	Integer insertEmpleados(Empleados empleado);
	
	Integer updateEmpleado(Empleados empleado);
	
	Integer deleteEmpleado(Empleados empleado);

}
