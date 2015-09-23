package com.centinela.dominio.entidades;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Opciones")
public class Opcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private String url;
	
	private String ulrImagen;
	
	@ManyToMany(mappedBy = "opciones")
	private List<Rol> roles;

	@ManyToOne
	private Aplicacion aplicacion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUlrImagen() {
		return ulrImagen;
	}

	public void setUlrImagen(String ulrImagen) {
		this.ulrImagen = ulrImagen;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}
