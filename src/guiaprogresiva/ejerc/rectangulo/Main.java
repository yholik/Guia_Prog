package guiaprogresiva.ejerc.rectangulo;
import java.util.Scanner;

/*1.1 RECTANGULO
- getArea(): double
Crear un método que retorne el área de un rectángulo.

- getPerimetro(): double
Crear un método que retorne el perimetro de un rectángulo

- isCuadrado(): boolean
Retorna true si la base es igual a la altura. En caso contrario retornar false.

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

			System.out.println("Ingresa el codigo de rectangulo en posicion " + i);
			rectangulos[i].codigo = sc.nextInt();
			System.out.println("Ingresa la base");
			rectangulos[i].base = sc.nextDouble();
			System.out.println("Ingresa la altura");
			rectangulos[i].altura = sc.nextDouble();
		}
		// FIN INGRESO DE DATOS DE RECTANGULOS

		
		String respuesta;	// ALMACENAMIENTO DE RESPUESTA DE USUARIO
		int menu; 	//SELECCION MENU
		do {
			System.out.println("Elegi que queres hacer: 1- SABER AREA | 2- SABER PERIMETRO | 3-¿ES CUADRADO? | 4-SALIR");
			menu = sc.nextInt();

			switch (menu) {

			case 1:// RETORNAR AREA DE UN RECTANGULO
				do {
					int codigoIngreso = 0;

					System.out.println("¿Cual es el indice del rectangulo que queres saber el area?");
					System.out.println("El indice va de 0 a " + (rectangulos.length - 1));
					codigoIngreso = sc.nextInt(); // VARIABLE PARA INDEXAR

					System.out.println(
							"El area del rectangulo " + codigoIngreso + " es " + rectangulos[codigoIngreso].getArea());
					System.out.println("¿Queres saber otra area?");
					respuesta = sc.next();

				} while (respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S');
				break;
			// FIN RETORNAR AREA

			case 2:// RETORNAR PERIMETRO DE UN RECTANGULO
				do {
					int codigoIngreso = 0;

					System.out.println("¿Cual es el indice del rectangulo que queres saber el perimetro?");
					System.out.println("El indice va de 0 a " + (rectangulos.length - 1));
					codigoIngreso = sc.nextInt(); // VARIABLE PARA INDEXAR

					System.out.println("El perimetro del rectangulo " + codigoIngreso + " es "
							+ rectangulos[codigoIngreso].getPerimetro());
					System.out.println("¿Queres saber otro perimetro?");
					respuesta = sc.next();

				} while (respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S');
				break;
			// FIN RETORNAR PERIMETRO

			case 3:// SABER SI ES CUADRADO O NO
				do {
					int codigoIngreso = 0;

					System.out.println("¿Cual es el indice del rectangulo que queres saber si es cuadrado?");
					System.out.println("El indice va de 0 a " + (rectangulos.length - 1));
					codigoIngreso = sc.nextInt(); // VARIABLE PARA INDEXAR

					if (rectangulos[codigoIngreso].isCuadrado()) {
						System.out.println("El rectangulo " + codigoIngreso + " ingresado es cuadrado");
					} else {
						System.out.println("El rectangulo " + codigoIngreso + " no es cuadrado");
					}

					System.out.println("¿Queres saber si otro es cuadrado?");
					respuesta = sc.next();

				} while(respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S');
				break;
				
			case 4: //SALIDA DEL PROGRAMA
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Error");
			}
		} while (menu != 4);
//FIN SWITCH

		sc.close();
	}

}
