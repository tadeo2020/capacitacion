package com.mx.proyecto.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.EmpleadosAdminDto;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Entity.EmpleadosAdmin;
import com.mx.proyecto.Repository.EmpleadosAdminDAO;
import com.mx.proyecto.Services.EmpleadosAdminService;

@Service
public class EmpleadosAdminServiceImpl implements EmpleadosAdminService {

	
	@Autowired
	private EmpleadosAdminDAO empleadosAdminDAO;

	@Override
	public List<EmpleadosAdmin> getEmpleados() {
		
		List<EmpleadosAdmin> listEmpleados = empleadosAdminDAO.obtenerTodosEmpleados();
		return listEmpleados;
	}

	@Override
	public ResponseDto insertEmpleadosAdmin(EmpleadosAdminDto nuevoEmpleado) {
		ResponseDto response = new ResponseDto();
		
		
		
	EmpleadosAdmin datos= new EmpleadosAdmin();
		datos.setID_EMPLEADO(nuevoEmpleado.getId_Empleado());
		datos.setNombreCompleto(nuevoEmpleado.getNombre_Completo());
		datos.setRfc(nuevoEmpleado.getRfc());
		datos.setCurp(nuevoEmpleado.getCurp());
		datos.setEdad(nuevoEmpleado.getEdad());
		datos.setSexo(nuevoEmpleado.getSexo());
		datos.setDireccion(nuevoEmpleado.getDireccion());
		datos.setNSS(nuevoEmpleado.getNss());
		datos.setTELEFONO(nuevoEmpleado.getTelefono());
		datos.setActivo(nuevoEmpleado.getActivo());
		
		Integer resp= empleadosAdminDAO.InsertarEmpleados(datos);
		
				if (resp==1) {
			response.setMessage("se inserto corectamente");
			response.setCode(200);///ok
		}
		else {
			response.setMessage("no se inserto corectamente");
			response.setCode(500);///error

		}
		return response;
	}

	@Override
	public ResponseDto eliminarEmpleadosAdmin(EmpleadosAdminDto activo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
