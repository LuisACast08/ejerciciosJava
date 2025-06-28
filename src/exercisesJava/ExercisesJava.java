package exercisesJava;
import java.util.Scanner;

public class ExercisesJava {
	
	//El óbjetivo de este método es intercambiar el valor entre dos variables.
	public void exerciseA(Scanner scan) {
		int num1;
		int num2;
		int auxN;
		
		System.out.println("El óbjetivo de este método es intercambiar el valor entre dos variables.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Ingresa los valores a intercambiar...");
		System.out.println("Ingresa el primer número:");
		num1= scan.nextInt();
		System.out.println("Ingresa el segundo número:");
		num2 = scan.nextInt();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Entonces número1= " + num1 + " número2= " + num2);
		System.out.println("Se intercambiará el número1= " + num1 + " por el número2= " + num2 + ", y viceversa");
		

		
		auxN = num1;
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Ahora el número 1= " + (num1= num2) + ", y el número 2= " + (num2= auxN));
	}
	
	public void exerciseB(Scanner scan) {
		//En el siguiente método devuelve el sueldo de un empleado dependiendo de su role:
		//repositor= 15890 + 10% bono
		//cajero= 25630,89
		//supervisor= 35630,20 - 11% jubilación
		String rol="";
		double sueldo;
		
		System.out.println("En el siguiente método devuelve el sueldo de un empleado dependiendo de su role:");
		System.out.println("repositor= 15890 + 10% bono");
		System.out.println("cajero= 25630,89");
		System.out.println("supervisor= 35630,20 - 11% jubilación");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Ingresa el rol: ");
		rol = scan.next();
		
		switch(rol) {
			case "repositor":
				sueldo = 15890 + (15890 * 0.10);
				System.out.printf("El sueldo asignado al rol '" + rol + "' es de: $%.3f", sueldo, "\n");
				break;
			case "cajero":
				sueldo = 25630.89;
				System.out.println("El sueldo asignado al rol '" + rol + "' es de: $" + sueldo);
				break;
			case "supervisor":
				sueldo = 35630.20 - (35630.20 * 0.11);
				System.out.printf("El sueldo asignado al rol '" + rol + "' es de: $%.3f", sueldo,"\n");
				break;
			default:
				System.out.println("Rol no encontrado");
				break;
				
		}
	}
	
	public void exerciseC(Scanner scan) {
		//Se recorre un vector de n dimenciones dadas por consola, se ingresa luego n cantidad de números 
		//e indica cuantos numeros ingresados son el número 3.
		int tamanioV;
		int aux; //variable auxiliar para tomar los números ingresados y tambien para mostrar el resultado de números 3 encontrados
		int vectorN[];
		
		System.out.println("Hola!");
		System.out.println("En este ejercico se recorre un vector de n dimenciones dadas por consola, ");
		System.out.println("se ingresa luego n cantidad de números enteros e indica cuantos numeros ingresados son el número 3");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Ingresa el tamaño o número de posiciones del vector: ");
		
		tamanioV = scan.nextInt();
		vectorN = new int [tamanioV];
		
		System.out.println("Ahora ingresa " + tamanioV + " números enteros.");
		//Ingresa los números al vector
		for (int i = 0; i < tamanioV; i++) {
			System.out.print((i+1) + ": ");
			aux = scan.nextInt();
			vectorN[i] = aux;
		}
		
		aux = 0;
		//Recorre el vector
		for (int i = 0; i < tamanioV - 1; i++) {
			if (vectorN[i] == 3) {
				aux++;
			}
		}
		
		System.out.println("El número 3 se repite " + aux + " veces en el vector");
	}
	
	public void exerciseD(Scanner scan) {
			System.out.println("En proceso...");
		}
}
