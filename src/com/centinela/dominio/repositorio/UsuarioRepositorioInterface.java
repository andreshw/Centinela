package com.centinela.dominio.repositorio;

import java.util.Collection;
import com.centinela.dominio.entidades.Usuario;

public interface UsuarioRepositorioInterface {
	
	void CrearUsuario(Usuario usuario);
	
	void ValidarUsuario(Usuario usuario);
	
	Collection<Usuario> ConsultarUsuarios();
}
