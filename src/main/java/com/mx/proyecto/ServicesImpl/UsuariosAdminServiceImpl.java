package com.mx.proyecto.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.proyecto.Dto.ResponseDto;
import com.mx.proyecto.Dto.UsuariosAdminDto;
import com.mx.proyecto.Entity.UsuariosAdmin;
import com.mx.proyecto.Repository.UsuariosAdminDAO;
import com.mx.proyecto.Services.UsuariosAdminService;

@Service
public class UsuariosAdminServiceImpl implements UsuariosAdminService {

	@Autowired
	private UsuariosAdminDAO usuariosAdminDAO;

	@Override
	public List<UsuariosAdmin> getUsuarios() {
		
		List<UsuariosAdmin> listUsuarios = usuariosAdminDAO.obtenerTodosUsuarios();
		
		
		return listUsuarios;
	}

	@Override
	public ResponseDto insertUsuariosAdmin(UsuariosAdminDto nuevoUsuario) {
	////los datos que vienen del postman vienen del objeto====nuevoUsuario
		UsuariosAdmin datos = new UsuariosAdmin(); ////es crear un objeto datos
		datos.setIdUser(nuevoUsuario.getIdUser());
		datos.setNombreCompleto(nuevoUsuario.getNombreCompleto());
		datos.setEdad(nuevoUsuario.getEdad());
		datos.setDireccion(nuevoUsuario.getDireccion());
		datos.setEstado(nuevoUsuario.getEstado());
		datos.setRol(nuevoUsuario.getRol());
		
		
		return null;
	}///fin del metodo

}// fin de la implementacion serv
