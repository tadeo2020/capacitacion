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

import com.mx.proyecto.Dto.Empleados;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.Supervisores;
import com.mx.proyecto.Services.ServiceSupervisores;

@Controller
@RequestMapping(value="supervisores")
public class SupervisoresController {

	@Autowired
	private ServiceSupervisores serviceSupervisores;
	
	//crud
	//create
	///read
	///update
	////delate
	
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/getSupervisores", method = RequestMethod.GET, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity <  List<Supervisores> > getSupervisores(){  //NOMBRE DEL METODO
		final HttpHeaders httpHeaders = new HttpHeaders();
		System.out.println("Llegando al servicio getSupervisores");
		List<Supervisores> listaSupervisores = serviceSupervisores.getSupervisores();
		System.out.println("Se obtuvieron "+listaSupervisores.size()+" registros pertenecientes a Supervisores");
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <List<Supervisores>> (listaSupervisores, httpHeaders, HttpStatus.OK);
    }
	
	//Metodo para insertar
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/insertSupervisores", method = RequestMethod.POST, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > insertSupervisores(@RequestBody Supervisores supervisor){  //NOMBRE DEL METODO
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceSupervisores.insertSupervisores(supervisor);
		System.out.println("Llegando al servicio getSupervisores");
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
    }//Fin del del metodo
	
	
	
	///// crud---- insertar
	
	////7metodo updete//////
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/updateSupervisores", method = RequestMethod.PUT, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > updateSupervisores(@RequestBody Supervisores supervisor){  //NOMBRE DEL METODO
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceSupervisores.updateSupervisores(supervisor);
		System.out.println("Llegando al servicio getSupervisores");
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
    }//Fin del del metodo
	
	///comienzo del metodo delate//////////
	@ResponseBody //NOS PERMITE RETORNAR UNICAMENTE DATOS, Y NO UNA VISTA
    @RequestMapping(value="/deleteSupervisores", method = RequestMethod.DELETE, produces = "application/json") //NOMBRE DEL SERVICIO
	ResponseEntity < ResponseDto > delateSupervisores(@RequestBody Supervisores supervisor){  //NOMBRE DEL METODO
		ResponseDto response = new ResponseDto();
		final HttpHeaders httpHeaders = new HttpHeaders();
		response = serviceSupervisores.deleteSupervisores(supervisor);
		System.out.println("Llegando al servicio getSupervisores");
		
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		return new ResponseEntity <ResponseDto> (response, httpHeaders, HttpStatus.OK);
	 }
}//Fin de la clase





/////////////@Autowired sirve para conectar el controlodor con la implementacion del servicio//////crando un metodo private service