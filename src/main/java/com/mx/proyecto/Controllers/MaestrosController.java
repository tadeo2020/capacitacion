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

import com.mx.proyecto.Dto.Maestros;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.Supervisores;
import com.mx.proyecto.Services.ServiceMaestros;

@Controller
@RequestMapping(value = "maestros")
public class MaestrosController {
	@Autowired
	private ServiceMaestros serviceMaestros;

	@ResponseBody // NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	@RequestMapping(value = "/getMaestros", method = RequestMethod.GET, produces = "application/json") // NOMBRE DEL
																										// SERVICIO
	ResponseEntity<List<Maestros>> getMaestros() { // NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();
		System.out.println("Llegando al servicio getMaestros");
		List<Maestros> listaMaestros = serviceMaestros.getMaestros();
		System.out.println("Se obtuvieron " + listaMaestros.size() + " registros pertenecientes a Maestros");
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<List<Maestros>>(listaMaestros, httpHeaders, HttpStatus.OK);
	}
	/////// fin de controlador

	//// creacion de insert

	@ResponseBody // NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	@RequestMapping(value = "/insertMaestros", method = RequestMethod.POST, produces = "application/json") // NOMBRE DEL
																											// SERVICIO
	ResponseEntity<ResponseDto> insertMaestros(@RequestBody Maestros maestro) {
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceMaestros.insertMaestros(maestro);
		System.out.println("Llegando al servicio insertMaestros");
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	}

	///////// fin el insert

	///// comienzo del update
	@ResponseBody // NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
	@RequestMapping(value = "/updateMaestros", method = RequestMethod.PUT, produces = "application/json") // NOMBRE DEL
																											// SERVICIO
	ResponseEntity<ResponseDto> updateMaestros(@RequestBody Maestros maestro) {
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceMaestros.updateMaestros(maestro);
		System.out.println("Llegando al servicio getMaestros");
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		return new ResponseEntity<ResponseDto>(response, httpHeaders, HttpStatus.OK);
	}
	//////////////////////////////termina update
	////////////////////////////empiza delate
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/deleteMaestros", method = RequestMethod.DELETE, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > delateMaestros(@RequestBody Maestros maestro){  //NOMBRE DEL METODO
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceMaestros.deleteMaestros(maestro);
		System.out.println("Llegando al servicio getMaestros");
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
	 }
}
