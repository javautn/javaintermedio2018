package com.utn.vista;

import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {
		//creo un objeto de tipo persona
		
		
		/*
		 * Mutabilidad en inmutabilidad
		 * Teoria
		 * la mutabilidad es un x-men
		 * una variable que se iniciliza de una forma y por x razon
		 * cambia su valor
		 * 
		 */
		
		final String danielPoder = "Ciclope";
		
		//System.out.println(danielPoder);

		//danielPoder = "pus por los ojos";
		//System.out.println("MUTO");
		//System.out.println(danielPoder);
		
		//ejemplo con objetos inmutables
		final Persona p1 = new Persona("David", 12345);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getDni());
		//p1=new Persona("Diego",123123); NO se puede volver a inicializar el objeto porque esta definido como inmutable
		//p1.setNombre("Diego");
		p1.setDni(79890);
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getDni());
		
		//Mutabilidad no va  a dar ningun error a la hora de volver a modificar el objeto
		Persona p2 = new Persona ("lucas",123123);
		
		System.out.println(p2.getNombre());
		p2= new Persona("julian", 321312);
		System.out.println(p2.getNombre());
		
		
		//asociasion entre inutables y mutables
		final Persona p3= new Persona("Mauro",65446);
		
		Persona p4 = p3;//es la misma posicion de memoria
		
		//p4.setNombre("Agustina");
		System.out.println(p3.getNombre() + " <-------");
		
		p4 = new Persona("Roxana",987645);
		System.out.println(p4.getNombre());
		
	}

}
