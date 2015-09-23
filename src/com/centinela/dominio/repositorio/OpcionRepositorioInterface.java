package com.centinela.dominio.repositorio;

import java.util.Collection;
import com.centinela.dominio.entidades.Opcion;

public interface OpcionRepositorioInterface {
	void CrearOpcion(Opcion opcion);
	
	Collection<Opcion> ConsultarOpciones();
}
