package com.mx.proyecto.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.Empleados;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Repository.RepositoryEmpleados;
import com.mx.proyecto.Services.ServiceEmpleados;

@Service
public class ServiceEmpleadosImpl implements ServiceEmpleados{
	
	@Autowired
	private RepositoryEmpleados repositoryEmpleados;
	
	@Override
	public List<Empleados> getEmpleados() {
		// TODO Auto-generated method stub
		System.out.println("Llegando al metodo getEmpleados de la clase ServiceEmpleadosImpl");
		return repositoryEmpleados.getEmpleados();
	}

	
	public ResponseDto insertEmpleados(Empleados empleado){
		Integer resultado = repositoryEmpleados.insertEmpleados(empleado);
		ResponseDto response = new ResponseDto();
		if(resultado == 1) {
			response.setMessage("Se inserto correctamente");
			response.setCode(1);
		}
		else {
			response.setMessage("No se inserto correctamente");
			response.setCode(-1);
		}
		// TODO Auto-generated method stub
		return response;
	}


	@Override
	public ResponseDto updateEmpleado(Empleados empleado) {
		Integer resultado = repositoryEmpleados.updateEmpleado(empleado);
		ResponseDto response = new ResponseDto();
		if(resultado == 1) {
			response.setMessage("Se actualizo correctamente");
			response.setCode(1);
		}
		else {
			response.setMessage("No se actualizo correctamente");
			response.setCode(-1);
		}
		// TODO Auto-generated method stub
		return response;
	}


	@Override
	public ResponseDto deleteEmpleado(Empleados empleado) {
		Integer resultado = repositoryEmpleados.deleteEmpleado(empleado);
		ResponseDto response = new ResponseDto();
		String respuesta = "";
		
		if(resultado == 1)
			respuesta = "Se elimino correctamente el registro " + empleado.getIdEmpleados();
		
		else	
			respuesta = "No se elimino el registro " + empleado.getIdEmpleados();
		
		response.setMessage(respuesta);
		response.setCode(
				
				(respuesta.contains("correctamente")?1 : -1)
				
				);
		
		// TODO Auto-generated method stub
		return response;
	}

}
