package com.utn.modelo.formato;

import com.utn.modelo.Genero;
import com.utn.modelo.Pelicula;

public class DVD extends Pelicula {

	public DVD(String nombre, Genero genero, double precio) {
		super(nombre, genero, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tipoFormato() {
		// TODO Auto-generated method stub
		return null;
	}

}
