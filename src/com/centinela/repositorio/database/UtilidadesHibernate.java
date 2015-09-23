package com.centinela.repositorio.database;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UtilidadesHibernate {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	
	static{
		Configuration configuracion = new Configuration().configure();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuracion.getProperties()).build();
		sessionFactory = configuracion.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}	
}