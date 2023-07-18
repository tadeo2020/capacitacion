package com.mx.proyecto.RepositoryImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mx.proyecto.Entity.UsuariosAdmin;
import com.mx.proyecto.Repository.UsuariosAdminDAO;

   @Repository
public class UsuariosAdminDAOImpl implements UsuariosAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	///// construccion/////
	public UsuariosAdminDAOImpl() {//// constructor vacio
	}

	public UsuariosAdminDAOImpl(SessionFactory sessionFactory) {//// constructor con un parametro
		this.sessionFactory = sessionFactory;
	}

	//// Primer servicio para realizar la consulta select * from tabla
	@Override
	@SuppressWarnings("unchecked") /// quita lineas amarillas
	@Transactional() /// es equivalente a un commit
	public List<UsuariosAdmin> obtenerTodosUsuarios() {

		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(UsuariosAdmin.class);
		return (List<UsuariosAdmin>) criteria.list();
	}

}// fin de laimplementacion del DAO
