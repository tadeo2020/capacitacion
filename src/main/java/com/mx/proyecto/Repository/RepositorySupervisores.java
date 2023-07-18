package com.mx.proyecto.Repository;

import java.util.List;


import com.mx.proyecto.Dto.Supervisores;


public interface RepositorySupervisores {
 
	List<Supervisores>getSupervisores();
	
	Integer insertSupervisores(Supervisores supervisor);
	
	Integer updateSupervisores(Supervisores supervisor);

	Integer deleteSupervisores(Supervisores supervisor);

	

}
