package com.centinela.dominio.repositorio;

import java.util.Collection;
import com.centinela.dominio.entidades.Rol;

public interface RolRepositorioInterface {
	void CrearRol(Rol rol);
	
	Collection<Rol> ConsultarRoles();
}
