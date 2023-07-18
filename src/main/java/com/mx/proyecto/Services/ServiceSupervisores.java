package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.Supervisores;

public interface ServiceSupervisores {

	List<Supervisores>getSupervisores();
	
	ResponseDto insertSupervisores(Supervisores supervisor);
	
	ResponseDto updateSupervisores(Supervisores supervisor);

	ResponseDto deleteSupervisores(Supervisores supervisor); 
}





////////// <>/////// en la interfas solo se declaran los metodos///////