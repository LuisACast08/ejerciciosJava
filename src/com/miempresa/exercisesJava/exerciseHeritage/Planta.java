package com.miempresa.exercisesJava.exerciseHeritage;

public abstract class Planta {
	private String nombre;
	private double altoT;
	private boolean hojas;
	private String climaI;
	
	protected Planta() {
	}

	protected Planta(String nombre, double altoT, boolean hojas, String climaI) {
		this.nombre = nombre;
		this.altoT = altoT;
		this.hojas = hojas;
		this.climaI = climaI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltoT() {
		return altoT;
	}

	public void setAltoT(double altoT) {
		this.altoT = altoT;
	}

	public boolean isHojas() {
		return hojas;
	}

	public void setHojas(boolean hojas) {
		this.hojas = hojas;
	}

	public String getClimaI() {
		return climaI;
	}

	public void setClimaI(String climaI) {
		this.climaI = climaI;
	}

	@Override
	public String toString() {
		return "Planta [nombre=" + nombre + ", altoT=" + altoT + ", hojas=" + hojas + ", climaI=" + climaI + "]";
	}
	
	public abstract void mensajePlanta();
	
}
