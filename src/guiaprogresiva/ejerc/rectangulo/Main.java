package guiaprogresiva.ejerc.rectangulo;

import java.util.Scanner;

/*
 * RECTANGULO
 * - getArea(): double
 * Crear un método que retorne el área de un rectángulo.
 * 
 * - getPerimetro(): double
 * Crear un método que retorne el perimetro de un rectángulo
 * 
 * - isCuadrado(): boolean
 * Retorna true si la base es igual a la altura. En caso contrario retornar false.
 * 
 * Realizar un programa donde se solicite el código, la base y la altura de dos rectángulos.
 * Luego, se muestre el perímetro y área de cada uno de ellos. 
 * 
 * //TODO También hay que mostrar una advertencia si es cuadrado. Al finalizar, 
 * //TODO Se debe mostrar el código del rectángulo con mayor área.
 * 
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// INGRESO DE CANTIDAD PARA EL VECTOR RECTANGULOS[]
		System.out.println("¿Cuantos rectangulos queres ingresar?");
		int cantidadRectangulos = sc.nextInt();

		// CREAMOS LA CLASE RECTANGULO CON VECTOR DE RECTANGULOS
		Rectangulo rectangulos[] = new Rectangulo[cantidadRectangulos];

		// INICIO INGRESO DE DATOS DE RECTANGULOS
		for (int i = 0; i < rectangulos.length; i++) {
			rectangulos[i] = new Rectangulo();

			System.out.println("Ingresa el codigo de rectangulo");
			rectangulos[i].codigo = sc.nextInt();

			boolean confirma = false;
			do {
				System.out.println("Ingresa la base");
				rectangulos[i].base = sc.nextDouble();
				System.out.println("Ingresa la altura");
				rectangulos[i].altura = sc.nextDouble();

				if (rectangulos[i].isCuadrado()) {
					String respuesta;
					System.out.println("El rectangulo que ingresaste es un cuadrado jaja");
					System.out.println("La base y la altura no puede ser igual, lo ingresas igual?");

					respuesta = sc.next();
					if (respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S') {
						confirma = true;
					} else {
						System.out.println("Vamos a ingresarlo de nuevo");
					}
				} else {
					confirma = true;
				}
			} while (!confirma);
		}
		// FIN INGRESO DE DATOS DE RECTANGULOS

		int menu; // SELECCION MENU
		int codUsuario;
		String respuesta;
		do {
			System.out.println("Elegi que queres hacer: \n 1- SABER AREA \n "
					+ "2- SABER PERIMETRO \n 3-¿ES CUADRADO? \n 4-SALIR");
			menu = sc.nextInt();

			switch (menu) {

			// RETORNAR AREA DE UN RECTANGULO
			case 1:
				boolean encontrado1 = false;
				System.out.println("Para saber el area ingresa el codigo del rectangulo");

				do {
					int i = 0;
					codUsuario = sc.nextInt(); // VARIABLE PARA INDEXAR

					for (i = 0; i < rectangulos.length; i++) {
						if (rectangulos[i].getCodigo() == codUsuario) {
							double areaR = rectangulos[i].getArea();
							System.out.println("El area es: " + areaR);
							encontrado1 = true;
							i = rectangulos.length;
						}
					}

					if (!encontrado1) {
						System.out.println("No se encontro el codigo ingresado");
						// OPCION DE SALIR AL MENU
						System.out.println("¿Queres ingresarlo de nuevo?");
						respuesta = sc.next();

						if (respuesta.charAt(0) == 'n' || respuesta.charAt(0) == 'N') {
							encontrado1 = true;
						} else {
							System.out.println("Ingresa el codigo:");
						}
					}

				} while (!encontrado1);
				break;
			// FIN RETORNAR AREA

			// SABER PERIMETRO DE UN RECTANGULO
			case 2:
				boolean encontrado2 = false;
				System.out.println("Para saber el perimetro ingresa el codigo del rectangulo");

				do {
					int i = 0;
					codUsuario = sc.nextInt(); // VARIABLE PARA INDEXAR

					for (i = 0; i < rectangulos.length; i++) {
						double perimetroR = 0; // INICIALIZACION EN 0 DE VARIABLE
						if (rectangulos[i].getCodigo() == codUsuario) {
							perimetroR = rectangulos[i].getPerimetro();
							System.out.println("El perimetro es: " + perimetroR);
							encontrado2 = true;
							i = rectangulos.length;
						}
					}

					if (!encontrado2) {
						System.out.println("No se encontro el codigo ingresado");
						// OPCION DE SALIR AL MENU
						System.out.println("¿Queres ingresarlo de nuevo?");
						respuesta = sc.next();

						if (respuesta.charAt(0) == 'n' || respuesta.charAt(0) == 'N') {
							encontrado2 = true;
						} else {
							System.out.println("Ingresa el codigo:");
						}
					}

				} while (!encontrado2);
				break;

			// FIN RETORNAR PERIMETRO

			// SABER SI ES CUADRADO O NO
			case 3:
				boolean encontrado3 = false;
				System.out.println("Para saber si es cuadrado,");
				System.out.println("ingresa el codigo del rectangulo:");
				do {
					int i = 0;
					codUsuario = sc.nextInt(); // VARIABLE PARA INDEXAR

					for (i = 0; i < rectangulos.length; i++) {

						if (rectangulos[i].getCodigo() == codUsuario) {
							if (rectangulos[i].isCuadrado()) {
								System.out.println("El rectangulo " + rectangulos[i].getCodigo() + "es cuadrado");
								encontrado3 = true;
								i = rectangulos.length;
							} else {
								System.out.println("El rectangulo no es cuadrado");
								encontrado3 = true;
								i = rectangulos.length;
							}
						}
					}

					if (!encontrado3) {
						System.out.println("No se encontro el codigo ingresado");
						// OPCION DE SALIR AL MENU
						System.out.println("¿Queres ingresarlo de nuevo?");
						respuesta = sc.next();

						if (respuesta.charAt(0) == 'n' || respuesta.charAt(0) == 'N') {
							encontrado3 = true;
						} else {
							System.out.println("Ingresa el codigo:");
						}
					}

				} while (!encontrado3);
				break;
			// FIN SABER SI ES CUADRADO

			case 4: // SALIDA DEL PROGRAMA
				System.out.println("Saliendo...");
				System.out.println("---FIN DEL PROGRAMA---" + "\n Yamila Holik - 2025");

				break;
			// FIN SALIDA DEL PROGRAMA

			default:
				System.out.println("Error");
			}
		} while (menu != 4);
//FIN SWITCH

		sc.close();
	}

}
