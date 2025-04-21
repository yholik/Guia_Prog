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

		int cantidadAutos = 0;
		double horasRecorridas = 0;

		System.out.println("PROGRAMA PARA AUTOS");
		System.out.println("Ingresa cuantos autos vas a cargar");
		cantidadAutos = sc.nextInt();

		Auto autos[] = new Auto[cantidadAutos];
		
		// INGRESO DE AUTOS
		for (int i = 0; i < autos.length; i++) {
			autos[i] = new Auto();
			System.out.println("Ingrese la patente, debe tener 6 caracteres");
			boolean confirmado1 = false;

			do {
				autos[i].patente = sc.next();

				if (autos[i].isPatenteValida()) {
					System.out.println("La patente ingresada es valida");
					confirmado1 = true;
				} else {
					System.out.println("La patente ingresada no es valida, ingrese de nuevo");
					System.out.println("Ingresar patente: ");
				}
			} while (!confirmado1);

			System.out.println("Ingrese la velocidad del auto");
			autos[i].velocidad = sc.nextDouble();

			System.out.println("Ingrese el kilometraje");
			autos[i].kilometros = sc.nextDouble();
		}
		// FIN INGRESO DE AUTOS

		// INGRESAR PATENTE PARA SABER KMS
		String patenteIngr;
		boolean confirmado2 = false;
		System.out.println("Ingresa la patente del auto para saber sus KMS");
		
		do {
		patenteIngr = sc.next();
		
		for (int i = 0; i < autos.length; i++) {
			if (patenteIngr.equals(autos[i].getPatente())) {
				confirmado2 = true;
				
				//SI SE ENCUENTRA LA PATENTE
				if (autos[i].isCeroKilometros()) {
					System.out.println("El auto es 0 Kilometros");
				} else {
					System.out.println("El auto tiene " + autos[i].kilometros + " kms");
					horasRecorridas = autos[i].getHorasRecorridas();
					System.out.println("Anduvo un total de " + horasRecorridas + "hs");
				}
			i = autos.length; //CORTO BUCLE FOR EN CONDICION VERDADERA
			
			}else{ // SI NO SE ENCUENTRA LA PATENTE
				System.out.println("No se encuentra la patente o le faltan datos");
				System.out.println("Ingrese nuevamente");
			}
			
		}
		}while(!confirmado2);
		//FIN INGRESO DE PATENTE PARA SABER KMS
		
		
		System.out.println("Fin del programa");

		sc.close();
	}

}
