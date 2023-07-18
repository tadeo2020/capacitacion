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

import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.Supervisores;
import com.mx.proyecto.Dto.UsuariosAdminDto;
import com.mx.proyecto.Entity.UsuariosAdmin;
import com.mx.proyecto.Services.UsuariosAdminService;

@Controller
@RequestMapping(value = "usuariosAdmin")
public class UsuariosAdminController {

	@Autowired
	private UsuariosAdminService usuariosAdminService; // es la inyeccion de dependencias

	// crud////////
	// create
	/// read
	/// update
	//// delate
	/// lista de ususarios------SELEC * FROM
	@ResponseBody // NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	@RequestMapping(value = "/getUsuariosAdmin", method = RequestMethod.GET, produces = "application/json") // NOMBRE
																											// DEL
																											// SERVICIO
	ResponseEntity<List<UsuariosAdmin>> getUsuariosAdmin() { // NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();

		List<UsuariosAdmin> lista= usuariosAdminService.getUsuarios();

		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<List<UsuariosAdmin>>(lista, httpHeaders, HttpStatus.OK);
	}

	
	//Metodo para insertar hibernet
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/insertUsuarios", method = RequestMethod.POST, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > insertUsuarios(@RequestBody UsuariosAdminDto nuevoUsuario){  //NOMBRE DEL METODO
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = usuariosAdminService.insertUsuariosAdmin(nuevoUsuario);
		System.out.println("Llegando al servicio getSupervisores");
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
    }//Fin del del metodo
	
////servicio rest=== respuesta json  {"nombre":"juan"
	//servicios Soap== archivos xml
}/// fin de la clase
