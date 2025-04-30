package guiaprogresiva.ejerc.estudiante;

public class Estudiante {
	public String nombre;
	public String apellido;
	public int documento;

	public double notaGeografia;
	public double notaMatematica;
	public double promedio;

	public double getPromedio() {
		double promedio = (this.notaMatematica + this.notaGeografia) / 2;
		return promedio;
	}

	public boolean isGeografiaAprobada() {
		boolean resultado = this.notaGeografia >= 4;
		return resultado;
	}

	public char getInicial() {
		char inicial = this.nombre.charAt(0);
		return inicial;
	}

	public String getEstadoMatematica() {
		String leyenda="ERROR";
		if(this.notaMatematica <= 10 && this.notaMatematica >= 0){
			if(this.notaMatematica >= 7) {
				leyenda = "PROMOCION";
				
			}else if(this.notaMatematica >= 4){
				leyenda = "FINAL";
			}else if(this.notaMatematica> 0) {
				
				leyenda = "RECURSA";
			}
		}


		return leyenda;
	}
	
	public String getNotaGeografiaEnPalabra() {
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
