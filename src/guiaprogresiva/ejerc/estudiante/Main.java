package guiaprogresiva.ejerc.estudiante;

import java.util.Scanner;

/*1.2.1 
 * getPromedio(): double
 * Retorna el promedio de la notaMatematica y la notaGreografia del alumno.
 * 
 * isGeografiaAprobada(): boolean
 * Retorna true si la notaGreografia es mayor o igual que 4. En caso contrario retornar false
 * 
 * getInicial(): char
 * Retorna la primera letra del nombre del estudiante.
 * Para esto podemos utilizar el método charAt.
 * Ej:
 * String palabra = “hola”;
 * char primerLetra = palabra.charAt(0);
 * 
 *  getEstadoMatematica(): String
 *  Retornar las palabras “PROMOCION”, “FINAL” o “RECURSA” en base a la 
 *  notaMatematica del estudiante.
 *  
 *  getNotaGeografiaEnPalabra(): String
 *  Retorna la notaGeografia pero en su versión palabra. Ej: Si la notaGeografia es 3 
 *  retorna la palabra “Tres”. Si no se ingresa una nota valida, debe retornar “N/A”.
 *  Se recomienda hacer un switch con muchos retornos.

 * */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cantidadVector = 0; // Variable para longitud de vector
		int opcion; // Selector menu

		System.out.println("Programa de registro de estudiantes");

		do {
			System.out.println("¿Cuantos estudiantes deseas cargar? Solo podes ingresar una vez este dato");
			cantidadVector = sc.nextInt();

			if (cantidadVector <= 0) {
				System.out.println("La cantidad no puede ser cero");
			}
		} while (cantidadVector <= 0);

		Estudiante estudiantes[] = new Estudiante[cantidadVector];
		
		
		// INICIO INGRESO DE DATOS ESTUDIANTES
		for (int i = 0; i < estudiantes.length; i++) {
			Estudiante nuevoEstudiante = new Estudiante();
			
			System.out.println("Nombre del estudiante Nº" + (i + 1));
			nuevoEstudiante.nombre = sc.next();
			System.out.println("Nota de geografia?");
			nuevoEstudiante.notaGeografia = sc.nextDouble();
			System.out.println("Nota de matematica");
			nuevoEstudiante.notaMatematica = sc.nextDouble();
			estudiantes[i] = nuevoEstudiante;
		
		}
		// FIN INGRESO DE DATOS ESTUDIANTES

		do {
			System.out.println("Selecciona la opcion que deseas del menu:"
		+ "\n 1- Mostrar datos de cada alumno" + "\n 2- Salir del programa");
			opcion = sc.nextInt();

			switch (opcion) {
			
			// MOSTRAR DATOS DE CADA ESTUDIANTE
			case 1:
				
				if(estudiantes[0] != null) {
					for (int i = 0; i < estudiantes.length; i++) {

						System.out.println("Nombre del estudiante: " + estudiantes[i].nombre);
						System.out.println("Inicial del estudiante: " + estudiantes[i].getInicial());

						if (estudiantes[i].isGeografiaAprobada()) {
							System.out.println("Geografia: APROBADA");
						} else {
							System.out.println("Geografia: DESAPROBADA");
						}
						System.out.println("El promedio del estudiante es: " + estudiantes[i].getPromedio());
						System.out.println("Estado de matematica: " + estudiantes[i].getEstadoMatematica());
						System.out.println("----------------------");
					}
				}else {
					System.out.println("No hay alumnos registrados, elegi opcion 1 o SALIR");
				}
				break;
				//FIN MOSTRAR DATOS DE CADA ESTUDIANTE
				
			case 2: 
				System.out.println("Saliendo del programa...");
				System.out.println("Fin");
				break;
				
			default:
				System.out.println("Error");
				break;

			}

		} while (opcion != 2);
	}
}
