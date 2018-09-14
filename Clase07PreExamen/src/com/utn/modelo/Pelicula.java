package com.utn.modelo;

import java.util.ArrayList;

public abstract class Pelicula {
	
	private ArrayList<Actor> listaActores;
	private Genero genero;
	private double precio;
	private String nombre;
	
	
	
	
	public Pelicula(String nombre,Genero genero, double precio) {
		this.genero = genero;
		this.precio = precio;
		this.nombre = nombre;
		
		//inicializo la lista por cada objeto de tipo pelicula que se crea
		this.listaActores = new ArrayList<Actor>();
	}

	



	public ArrayList<Actor> getListaActores() {
		return listaActores;
	}





	public void agregarActorPelicula(Actor actor) {
		this.listaActores.add(actor);
	}
	
	/*
	 * sel le agrega un actor
	 */





	public Genero getGenero() {
		return genero;
	}





	public void setGenero(Genero genero) {
		this.genero = genero;
	}





	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	//metodo abstracto
	public abstract String tipoFormato();

}
