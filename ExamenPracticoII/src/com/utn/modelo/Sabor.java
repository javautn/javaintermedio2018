package com.utn.modelo;

public class Sabor extends Bebida {
	
	private Variedades sabor;
	private Fernet fernet;
	

	
	public Sabor(Variedades variedades) {
		this.sabor = variedades;
	}
	
	
	
	public Variedades getSabor() {
		return sabor;
	}



	public void setSabor(Variedades gusto) {
		this.sabor = gusto;
	}



	@Override
	public void agregarBicarbonato() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agitar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reposar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void embazar() {
		// TODO Auto-generated method stub

	}
	
	public void inyectarAlcohol() {
		
	}
	

}
