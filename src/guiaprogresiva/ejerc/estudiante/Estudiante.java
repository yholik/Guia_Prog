package guiaprogresiva.ejerc.estudiante;

public class Estudiante {
	String nombre;
	String apellido;
	int documento;

	double notaGeografia;
	double notaMatematica;
	double promedio;

	double getPromedio() {
		double promedio = (this.notaMatematica + this.notaGeografia) / 2;
		return promedio;
	}

	boolean isGeografiaAprobada() {
		boolean resultado = this.notaGeografia >= 4;
		return resultado;
	}

	char getInicial() {
		char inicial = this.nombre.charAt(0);
		return inicial;
	}

	String getEstadoMatematica() {
		String leyenda;
		int nota = (int) Math.round(this.notaMatematica);
		
		switch (nota) {
		case 1, 2, 3:
			leyenda = "RECURSA";
			return leyenda;

		case 4, 5, 6:
			leyenda = "FINAL";
			return leyenda;

		case 7, 8, 9, 10:
			leyenda = "PROMOCION";
			return leyenda;

		default:
			leyenda = "ERROR";
			return leyenda;

		}
	}
	
	String getNotaGeografiaEnPalabra() {
		String palabra;
		int nota = (int) Math.round(this.notaGeografia);
		
		
		switch(nota){
		case 1:
			palabra = "Uno";
			return palabra;
		case 2:
			palabra = "Dos";
			return palabra;
		case 3:
			palabra = "Tres";
			return palabra;
		case 4:
			palabra = "Cuatro";
			return palabra;
		case 5:
			palabra = "Cinco";
			return palabra;
		case 6:
			palabra = "Seis";
			return palabra;
		case 7:
			palabra = "Siete";
			return palabra;
		case 8:
			palabra = "Ocho";
			return palabra;
		case 9:
			palabra = "Nueve";
			return palabra;
		case 10:
			palabra = "Diez";
			return palabra;
		default:
			palabra = "N/A";
			return palabra;
		}
	}
}
