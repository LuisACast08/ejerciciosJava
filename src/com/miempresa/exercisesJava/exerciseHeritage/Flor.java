package com.miempresa.exercisesJava.exerciseHeritage;

public class Flor extends Planta{
	private String colorPetalo;
	private double promedioPetalos;
	private String colorPistilo;
	private String colorPetalos;
	private String variedad;
	private String estación;
	

	public Flor() {
	}

	public Flor(String colorPetalo, double promedioPetalos, String colorPistilo, String colorPetalos, String variedad,
			String estación, String nombre, double altoT, boolean hojas, String climaI) {
		super(nombre, altoT, hojas, climaI);
		this.colorPetalo = colorPetalo;
		this.promedioPetalos = promedioPetalos;
		this.colorPistilo = colorPistilo;
		this.colorPetalos = colorPetalos;
		this.variedad = variedad;
		this.estación = estación;
	}

	

	public String getColorPetalo() {
		return colorPetalo;
	}

	public void setColorPetalo(String colorPetalo) {
		this.colorPetalo = colorPetalo;
	}

	public double getPromedioPetalos() {
		return promedioPetalos;
	}

	public void setPromedioPetalos(double promedioPetalos) {
		this.promedioPetalos = promedioPetalos;
	}

	public String getColorPistilo() {
		return colorPistilo;
	}

	public void setColorPistilo(String colorPistilo) {
		this.colorPistilo = colorPistilo;
	}

	public String getColorPetalos() {
		return colorPetalos;
	}

	public void setColorPetalos(String colorPetalos) {
		this.colorPetalos = colorPetalos;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getEstación() {
		return estación;
	}

	public void setEstación(String estación) {
		this.estación = estación;
	}

	@Override
	public void mensajePlanta() {
		System.out.println("Hola!, soy una flor.");
	}

}
