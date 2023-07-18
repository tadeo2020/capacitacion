package com.mx.proyecto.Repository;

import java.util.List;

import com.mx.proyecto.Dto.Maestros;


public interface RepositoryMaestros {

	List<Maestros> getMaestros();
	Integer insertMaestros(Maestros maestro);
	Integer updateMaestros(Maestros maestro);
	Integer deleteMaestros(Maestros maestro);
}
