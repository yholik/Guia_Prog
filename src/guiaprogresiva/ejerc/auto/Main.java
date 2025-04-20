/*
 * isCeroKilometros(): boolean
 * Retorna true si el kilometraje es 0. 
 * En caso contrario retornar false.
 * 
 * getHorasRecorridas(): double
 * Retorna cuantas horas estuvo andando el auto, 
 * para esto debemos dividir su kilometraje por su velocidad
*/

package guiaprogresiva.ejerc.auto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PROGRAMA PARA AUTOS");

		Auto autos = new Auto();

		System.out.println("Ingrese la velocidad del auto");
		autos.velocidad = sc.nextDouble();

		System.out.println("Ingrese el kilometraje");
		autos.kilometros = sc.nextDouble();

		double horasRecorridas = 0;
		
		if (autos.isCeroKilometros()) {
			System.out.println("El auto es 0 Kilometros");
			System.out.println("Fin del programa");
		} else {
			System.out.println("El auto tiene " + autos.kilometros
					+ " kms");
			horasRecorridas = autos.getHorasRecorridas();
			
			System.out.println("Anduvo un total de " + horasRecorridas
					+"hs");
			System.out.println("Fin del programa");
		}

		sc.close();
	}

}
