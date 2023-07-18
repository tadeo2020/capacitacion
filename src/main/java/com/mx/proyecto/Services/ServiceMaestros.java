package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.Maestros;
import com.mx.proyecto.Dto.ResponseDto;

public interface ServiceMaestros {

	List<Maestros> getMaestros();
	ResponseDto insertMaestros(Maestros maestro); 
	ResponseDto updateMaestros(Maestros maestro);
	ResponseDto deleteMaestros(Maestros maestro);
}