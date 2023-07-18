package com.mx.proyecto.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.Maestros;
import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Repository.RepositoryMaestros;
import com.mx.proyecto.Services.ServiceMaestros;

@Service
public class ServiceMaestrosImpl implements ServiceMaestros {
	@Autowired
	private RepositoryMaestros repositoryMaestros;

	@Override
	public List<Maestros> getMaestros() {
		// TODO Auto-generated method stub
		return repositoryMaestros.getMaestros();
	}

	@Override
	public ResponseDto insertMaestros(Maestros maestro) {
		Integer response = repositoryMaestros.insertMaestros(maestro);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se agrego correctamente el regisro: " + maestro.getIdmaestro());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se agrego correctamente el regisro: " + maestro.getIdmaestro());
		}
		return respuesta;

	}
///////termina insert

	@Override
	public ResponseDto updateMaestros(Maestros maestro) {
		Integer response = repositoryMaestros.updateMaestros(maestro);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se actulizo correctamente el regisro: " + maestro.getIdmaestro());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se actualizo correctamente el regisro: " + maestro.getIdmaestro());
		
	}
		return respuesta;
	}

	@Override
	public ResponseDto deleteMaestros(Maestros maestro) {
		Integer response = repositoryMaestros.deleteMaestros(maestro);
		ResponseDto respuesta = new ResponseDto();
		if (response == 1) {
			respuesta.setCode(1);
			respuesta.setMessage("Se elimino correctamente el regisro: " + maestro.getIdmaestro());

		} else {
			respuesta.setCode(1);
			respuesta.setMessage("No se elimino correctamente el regisro: " + maestro.getIdmaestro());
		}
		return respuesta;
	}

	//// comienza update
	
}
