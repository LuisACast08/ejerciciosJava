package com.miempresa.main;

import java.util.Scanner;
import com.miempresa.exercisesJava.ExercisesJava;
import com.miempresa.exercisesJava.exerciseHeritage.MenuPlanta;


public class Main {

	public static void main(String[] args) {
		
		exerciseMenu();

	}
	
	static Scanner scan = new Scanner(System.in);
	
	
	//Menú para selecionar el ejercicio a ejecutar
	//Se ejecuta hasta que se ingrese terminar en el menú
	
	public static void exerciseMenu() {
		String exerciseOption = "";
		
		while(true) {
			System.out.println("\n\n////////////////////////////////////////////////////////////////////////////\n");
			System.out.println("----------------------------Menú ejercicios---------------------------------\n");
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Ingrese un ejercicio (Ejemplo, A, B, C, ...) o 'terminar si desea volver al menú': ");
			
			exerciseOption = scan.next();
			
			if (exerciseOption.equalsIgnoreCase("terminar")) {
				System.out.println("Hasta luego :) ...");
				break; 
			}else {
				switch(exerciseOption.toUpperCase()) {
					case "A":
						System.out.println("----------------------------------------------------------------------------");
						ExercisesJava a = new ExercisesJava();
						a.exerciseA(scan);
						break;
					case "B":
						System.out.println("----------------------------------------------------------------------------");
						ExercisesJava b = new ExercisesJava();
						b.exerciseB(scan);
						break;
					case "C":
						System.out.println("----------------------------------------------------------------------------");
						ExercisesJava c = new ExercisesJava();
						c.exerciseC(scan);
						break;
					case "D":
						System.out.println("----------------------------------------------------------------------------");
						ExercisesJava d = new ExercisesJava();
						d.exerciseD(scan);
						break;
					case "E":
						MenuPlanta e = new MenuPlanta();
						e.menu(scan);
						break;
					default:
						System.out.println("----------------------------------------------------------------------------");
						System.out.println("Ejercicio no encontrado...");
						break;
				}
			}
		}
	}
}
