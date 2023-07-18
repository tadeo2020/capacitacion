package com.mx.proyecto.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mx.proyecto.Dto.EmpleadosAdminDto;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Entity.EmpleadosAdmin;
import com.mx.proyecto.Services.EmpleadosAdminService;

@Controller
@RequestMapping(value = "EmpleadosAdmin")

public class EmpleadosAdminController {
	@Autowired
	private EmpleadosAdminService empleadosAdminService;

	/// CRUD//// CREATE--READ--UPDATE--DELATE

	@ResponseBody // NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	@RequestMapping(value = "/getEmpleadosAdmin", method = RequestMethod.GET, produces = "application/json") // NOMBRE
																												// DEL
																												// SERVICIO
	ResponseEntity<List<EmpleadosAdmin>> getEmpleadosAdmin() { // NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();

		List<EmpleadosAdmin> lista = empleadosAdminService.getEmpleados();

		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<List<EmpleadosAdmin>>(lista, httpHeaders, HttpStatus.OK);
	}
	
	////SERVICIO PARA INSERTA USUARIO
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/insertEmpleados", method = RequestMethod.POST, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > insertEmpleados(@RequestBody EmpleadosAdminDto nuevoEmpleado){  //NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto response = empleadosAdminService.insertEmpleadosAdmin(nuevoEmpleado);
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
    }//Fin del del metodo
	/////eliminar registro
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/eliminarEmpleados", method = RequestMethod.POST, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > eliminarEmpleados(@RequestBody EmpleadosAdminDto activo){  //NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();
		
		ResponseDto response = empleadosAdminService.eliminarEmpleadosAdmin(activo);
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
	
	}///fin del sercivio eliminar
}//// fin de la clase
