package com.miempresa.exercisesJava.exerciseHeritage;

import java.util.Scanner;


public class MenuPlanta {
	public void menu(Scanner scan) {
		String option = "";
		String teclado = "";
		
		while(true) {
			System.out.println("\n\n////////////////////////////////////////////////////////////////////////////\n");
			System.out.println("----------------------------Menú plantas---------------------------------\n");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("A continuación podrá crear una planta, ingrese el tipo de planta a crear.");
			System.out.println("Ingrese (1) para crear arbol, (2) para crear flor y (3) para crear arbusto:");
			option = scan.next();
			
			if (option.equalsIgnoreCase("terminar")) {
				System.out.println("Hasta luego :) ...");
				break; 
			}else {
				switch(option) {
					case "1":
						Arbol arbol = new Arbol();
						arbol.mensajePlanta();
						System.out.println("Dale un nombre a tu arbol");
						teclado = scan.next();
						arbol.setNombre(teclado);
						System.out.println("Arbol llamado: " + arbol.getNombre());
						break;
					case "2":
						Flor flor = new Flor();
						flor.mensajePlanta();
						break;
					case "3":
						Arbusto arbusto = new Arbusto();
						arbusto.mensajePlanta();
						break;
				}
			}
		}	
	}
}
