package com.centinela.dominio.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Aplicaciones")
public class Aplicacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombreAplicacion;
	
	@OneToMany(mappedBy = "aplicacion")
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	@OneToMany(mappedBy = "aplicacion")
	private List<Opcion> opciones = new ArrayList<Opcion>();
	
	@OneToMany(mappedBy = "aplicacion")
	private List<Rol> roles = new ArrayList<Rol>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreAplicacion() {
		return nombreAplicacion;
	}

	public void setNombreAplicacion(String nombreAplicacion) {
		this.nombreAplicacion = nombreAplicacion;
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios){
		this.usuarios = usuarios;
	}

	public List<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
}
