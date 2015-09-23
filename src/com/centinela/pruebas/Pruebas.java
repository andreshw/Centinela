package com.centinela.pruebas;

import org.hibernate.Session;

import com.centinela.dominio.entidades.Aplicacion;
import com.centinela.repositorio.database.*;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = UtilidadesHibernate.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		Aplicacion aplicacion = new Aplicacion();
		aplicacion.setNombreAplicacion("me liga la liga");
		session.save(aplicacion);
		
		session.getTransaction().commit();
		session.close();
		UtilidadesHibernate.getSessionFactory().close();

	}

}
