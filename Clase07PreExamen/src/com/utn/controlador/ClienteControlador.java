package com.utn.controlador;

import com.utn.modelo.Cliente;
import com.utn.modelo.Genero;

public class ClienteControlador {

	//private PeliculaControlador{
		private PeliculaControlador pc;
	
	public ClienteControlador() {
		this.pc = new PeliculaControlador();
		// TODO Auto-generated constructor stub
	}
	
	public void alquiloPelicula() {
		System.out.println("Quiero una de accion");
		Cliente c1 = new Cliente("Felipe","felipe@mail.com", 60.0)
				
				this.pc.creoPelicula(Genero.ACCION);
		//devuelvo una lista con los formatos posibles
		//en esta lista devuelve los 3 objetos
		/*
		 * 1 DVD
		 * 2 VHS
		 * 3 BlueRAy
		 */
		if(c1.alquiloPelicula(this.pc.devuelvoListaPeliculas().get(1))) {
			System.out.println("Gracias por alquilar, quiere otra?");
			
			System.out.println("las peliculas que vio este cliente son:");
			c1.getListaPelisAlquiladas().forEach(x -> {
				System.out.println(x.getNombre() + " - Genero - " + x.getGenero());
			});
			
		}
	}

}

