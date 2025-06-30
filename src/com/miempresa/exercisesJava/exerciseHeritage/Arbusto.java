package com.miempresa.exercisesJava.exerciseHeritage;

public class Arbusto extends Planta{
	private double ancho;
	private boolean domestico;
	private String variedad;
	private String colorHojas;
	private boolean poda;
	
	
	
	public Arbusto() {
	}
	
	

	public Arbusto(double ancho, boolean domestico, String variedad, String colorHojas, boolean poda, 
			String nombre, double altoT, boolean hojas, String climaI) {
		super(nombre, altoT, hojas, climaI);
		this.ancho = ancho;
		this.domestico = domestico;
		this.variedad = variedad;
		this.colorHojas = colorHojas;
		this.poda = poda;
	}
	
	

	public double getAncho() {
		return ancho;
	}



	public void setAncho(double ancho) {
		this.ancho = ancho;
	}



	public boolean isDomestico() {
		return domestico;
	}



	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}



	public String getVariedad() {
		return variedad;
	}



	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}



	public String getColorHojas() {
		return colorHojas;
	}



	public void setColorHojas(String colorHojas) {
		this.colorHojas = colorHojas;
	}



	public boolean isPoda() {
		return poda;
	}



	public void setPoda(boolean poda) {
		this.poda = poda;
	}



	@Override
	public void mensajePlanta() {
		System.out.println("Hola!, soy un arbusto.");
	}

}
