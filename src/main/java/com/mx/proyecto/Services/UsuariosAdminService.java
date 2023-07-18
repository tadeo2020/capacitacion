package com.mx.proyecto.Services;

import java.util.List;

import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.UsuariosAdminDto;
import com.mx.proyecto.Entity.UsuariosAdmin;

public interface UsuariosAdminService {
	
	List<UsuariosAdmin> getUsuarios();

	ResponseDto insertUsuariosAdmin(UsuariosAdminDto nuevoUsuario);

}///fin de la interfas de servicio
