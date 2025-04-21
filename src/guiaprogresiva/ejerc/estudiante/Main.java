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

		int cantidadVector = 0;

		System.out.println("Cuantos estudiantes hay?");
		cantidadVector = sc.nextInt();
		Estudiante estudiantes[] = new Estudiante[cantidadVector];

		// INICIO INGRESO DE DATOS ESTUDIANTES
		for (int i = 0; i < estudiantes.length; i++) {
			estudiantes[i] = new Estudiante();

			System.out.println("Nombre del estudiante " + i);
			estudiantes[i].nombre = sc.next();
			System.out.println("Nota de geografia?");
			estudiantes[i].notaGeografia = sc.nextDouble();
			System.out.println("Nota de matematica");
			estudiantes[i].notaMatematica = sc.nextDouble();
		}
		// FIN INGRESO DE DATOS ESTUDIANTES

		
		// MOSTRAR DATOS DE CADA ESTUDIANTE
		for (int i = 0; i < estudiantes.length; i++) {
			System.out.println("Nombre del estudiante " + estudiantes[i].nombre);
			System.out.println("Inicial del estudiante " + estudiantes[i].getInicial());

			if (estudiantes[i].isGeografiaAprobada()) {
				System.out.println("Aprobo Geografia \n");
			} else {
				System.out.println("Desaprobo geografia \n");
			}

			System.out.println("El promedio del estudiante es: " + estudiantes[i].getPromedio());
			System.out.println("Estado de matematica: " + estudiantes[i].getEstadoMatematica());
		}

		sc.close();
	}

}
