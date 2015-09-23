package com.centinela.dominio.repositorio;

import java.util.Collection;
import com.centinela.dominio.entidades.Aplicacion;

public interface AplicacionRepositorioInterface {
	void CrearAplicacion(Aplicacion aplicacion);
	
	void EditarAplicacion(Aplicacion aplicacion);
	
	Collection<Aplicacion> ConsultarAplicaciones();
}
