package com.utn.modelo;

public class Perro extends Mamifero {

	private String raza;
	
	public Perro(String nombre, 
			double peso, 
			double altura, 
			int edad, 
			String raza) {
		super(nombre, peso, altura, edad);
		this.raza= raza;
	}

	@Override
	public void comunicarse() {
		System.out.println("guauu guauuuu!!!!");
		
	}

	@Override
	public String dormir(double horas) {
		return "Durmio " + horas + " hs!";
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Mamifero= " +super.toString() + "Perro [ raza=" + raza + "]" ;
	}

}
