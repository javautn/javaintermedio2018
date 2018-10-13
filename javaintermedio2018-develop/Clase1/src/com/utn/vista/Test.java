package com.utn.vista;

import com.utn.controlador.MamiferoControlador;
import com.utn.modelo.Mamifero;
import com.utn.modelo.Perro;
import com.utn.modelo.Persona;
import com.utn.modelo.Vaca;

public class Test {

	public static void main(String[] args) {

		MamiferoControlador mc = new MamiferoControlador();

		// la variable m es de tipo mamifero pero ...
		Mamifero m = mc.creoMamifero("persona"); // devuelve un objeto de tipo mamifero instanciado un objeto que extiende
												// dicha clase :)

		System.out.println(m.getClass().getSimpleName()); // Devuelve el nombre de la clase que fue instanciada
		System.out.println(m.getNombre());
		m.comunicarse();

		// comparamos que m se de tipo Persona
		if (m instanceof Persona) {
			// cast = la convercion de un tipo a otro
			Persona persona1 = (Persona) m;
			System.out.println(persona1.getNacionalidad());
		}

		// comparamos que m se de tipo Perro
		if (m instanceof Perro) {
			Perro perro1 = (Perro) m;  
			/*
			 * Asigno el objeto previamente creado
			 * sabiendo que es del tipo X  a un nuevo objeto/atributo/variable
			 	porq no hacemos el new
			 	RTA: si haces el new estas inicializando nuevamente el objeto
			 	perro1 = (ClasePerro)m <-- la instancia se copia a la nueva variable
			 
			 	perro1 => es estatico y se le asigna los valores de la instancia m
			 	
			 */
			System.out.println(perro1.getRaza());
		}

		if (m instanceof Vaca) {
			Vaca v1 = (Vaca) m;

			if (v1.isLechera()) {
				System.out.println("si es lechera y no la cocinamos");
			} else {
				System.out.println("va directo a la parrilla");
			}
		}

		// System.out.println(m.getClass()); //de que tipo es el objeto
		// getClass se hereda de la clase Objetct y sirve para mostrarnos o devolver el
		// tipo de la clase que fue instanciada

	}

}
