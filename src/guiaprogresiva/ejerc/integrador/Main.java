package guiaprogresiva.ejerc.integrador;
import guiaprogresiva.ejerc.estudiante.*;
import guiaprogresiva.ejerc.rectangulo.*;
import guiaprogresiva.ejerc.auto.*;
import java.util.Scanner;

import guiaprogresiva.ejerc.estudiante.Estudiante;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cantidadVector = 0; // Variable para longitud de vector
		int opcion; // Selector menu

		System.out.println("Programa de registro de estudiantes");


		Estudiante estudiantes1 = new Estudiante();
		
		System.out.println("Nombre del estudiante");
		estudiantes1.nombre = sc.next();
		System.out.println("Nota de geografia?");
		estudiantes1.notaGeografia = sc.nextDouble();
		System.out.println("Nota de matematica");
		estudiantes1.notaMatematica = sc.nextDouble();
	
			
		if(estudiantes1.getPromedio() < 7) {
			Rectangulo rectangulos = new Rectangulo();
			System.out.println("Ingresar datos de un supuesto rectangulo(area, base y altura)");
			System.out.println("AREA:");
			double area = sc.nextDouble();
			
			System.out.println("BASE:");
			rectangulos.base = sc.nextDouble();
			
			System.out.println("ALTURA:");
			rectangulos.altura = sc.nextDouble();
			
			if(area == rectangulos.getArea()) {
				estudiantes1.notaMatematica = 10;
			}else {
				System.out.println("No pasaste la prueba");
			}
			
			estudiantes1.getEstadoMatematica();
		} 
		
		if(estudiantes1.getPromedio() > 7){
			Auto nuevoAuto = new Auto();
			
			System.out.println("¡Felicidades! Te compraron un auto porque tu promedio es mayor a 7");
			
			System.out.println("Ingresa la patente");
			nuevoAuto.patente = sc.next();
			
			if(!nuevoAuto.isPatenteValida()) {
				System.out.println("Es un vehiculo ilegal");
				System.out.println("Podes hacer 1000 kilometros");
				nuevoAuto.kilometros = 1000;
			}
			
			System.out.println("Ingresa la velocidad");
			nuevoAuto.velocidad = sc.nextDouble();
			
			nuevoAuto.horasRecorridas = nuevoAuto.getHorasRecorridas();
			
			System.out.println("El viaje duro " + nuevoAuto.horasRecorridas + "hs");
			
		} else {
			System.out.println("Tu promedio no es suficiente para recibir un auto");
		}


	sc.close();
	}

}
