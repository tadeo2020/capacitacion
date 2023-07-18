package com.mx.proyecto.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.Supervisores;
import com.mx.proyecto.Repository.RepositorySupervisores;
import com.mx.proyecto.Services.ServiceSupervisores;

@Service
public class ServiceSupervisoresImpl implements ServiceSupervisores {
	@Autowired
	private RepositorySupervisores repositorySupervisores;

	@Override
	public List<Supervisores> getSupervisores() {
		// TODO Auto-generated method stub
		return repositorySupervisores.getSupervisores();
	}

	@Override
	public ResponseDto insertSupervisores(Supervisores supervisor) {
		Integer response = repositorySupervisores.insertSupervisores(supervisor);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se agrego correctamente el regisro: " + supervisor.getIdSupervisores());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se agrego correctamente el regisro: " + supervisor.getIdSupervisores());
		}
		return respuesta;
	}

	@Override
	public ResponseDto updateSupervisores(Supervisores supervisor) {
		Integer response = repositorySupervisores.updateSupervisores(supervisor);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se actualizo correctamente el regisro: " + supervisor.getIdSupervisores());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se actualizo correctamente el regisro: " + supervisor.getIdSupervisores());
		}
		return respuesta;
	}

	///// metodo delete
	@Override
	public ResponseDto deleteSupervisores(Supervisores supervisor) {
		Integer response = repositorySupervisores.deleteSupervisores(supervisor);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se elimino correctamente el regisro: " + supervisor.getIdSupervisores());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se elimino correctamente el regisro: " + supervisor.getIdSupervisores());
		}
		return respuesta;
	}
		
}

//////@service nos sirve para crear la logica del negocio

///////// < >////////