package com.utn.modelo;

public class Persona {
	//atributos privados
	private final String nombre;//una vez creado el objeto esta variable NO puede volver a cambiar el nombre
	private int dni;

	
	//encapsulamiento
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	/*public void setNombre(final String nombre) {
		//aca es donde se podria meter algo malicioso y cambiar el nombre si no hubiese final
		//nombre = " conoces a mane? ";
		this.nombre = nombre;
	}*/
	//constructor
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
}
