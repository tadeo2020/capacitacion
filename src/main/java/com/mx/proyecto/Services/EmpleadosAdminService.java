package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.EmpleadosAdminDto;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Entity.EmpleadosAdmin;

public interface EmpleadosAdminService {
	
	List<EmpleadosAdmin> getEmpleados();

	ResponseDto insertEmpleadosAdmin(EmpleadosAdminDto nuevoEmpleado);

	ResponseDto eliminarEmpleadosAdmin(EmpleadosAdminDto activo);

}
