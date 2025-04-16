package guiaprogresiva.ejerc.estudiante;

public class Estudiante {
	String nombre;
	String apellido;
	int documento;
	
	double notaGeografia;
	double notaMatematica;
	double promedio;
	
	double getPromedio(){
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
	
}
