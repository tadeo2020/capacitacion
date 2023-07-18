package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.Empleados;
import com.mx.proyecto.Dto.ResponseDto;

public interface ServiceEmpleados {
	
	List<Empleados> getEmpleados();
	
	ResponseDto insertEmpleados(Empleados empleado);
	
	ResponseDto updateEmpleado(Empleados empleado);
	
	ResponseDto deleteEmpleado(Empleados empleado);
	
	/*crud
	 * CREATE = INSERT
	 * UPDATE = ACTUALIZACIÓN
	 * READ = SELECT 
	 * DELETE = ELIMINAR
	*/
	/*List<Empleados> getEmpleados(){
	  return = null;
	 */

}
