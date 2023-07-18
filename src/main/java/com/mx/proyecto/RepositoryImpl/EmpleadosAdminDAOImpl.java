package com.mx.proyecto.RepositoryImpl;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mx.proyecto.Entity.EmpleadosAdmin;
import com.mx.proyecto.Repository.EmpleadosAdminDAO;

@Repository
public class EmpleadosAdminDAOImpl implements EmpleadosAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpleadosAdminDAOImpl() { ////constructor vacio
	}
	
	public EmpleadosAdminDAOImpl(SessionFactory sessionFactory) { ////constructor lleno
	this. sessionFactory = sessionFactory;
	}
	
	////primer servicio
	@Override
	@SuppressWarnings("unchecked")
	@Transactional()
	public List<EmpleadosAdmin> obtenerTodosEmpleados() {
		
		final Session session = sessionFactory.getCurrentSession();
		final Criteria criteria = session.createCriteria(EmpleadosAdmin.class);
		
		return(List<EmpleadosAdmin>) criteria.list();
	}

	@Override
	public Integer InsertarEmpleados(EmpleadosAdmin datos) {
		
		sessionFactory.getCurrentSession().save(datos);//// esto es el insert
		
		return 1;
	}

	
}////fin de la clase
