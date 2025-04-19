package guiaprogresiva.ejerc.auto;

/*
 * isCeroKilometros(): boolean
 * Retorna true si el kilometraje es 0. 
 * En caso contrario retornar false.
 * 
 * getHorasRecorridas(): double
 * Retorna cuantas horas estuvo andando el auto, 
 * para esto debemos dividir su kilometraje por su velocidad
*/

public class Auto {
	double kilometros;
	double velocidad;
	double horasRecorridas;
	
	boolean isCeroKilometros(){
		boolean esCero;
		esCero = this.kilometros == 0;
		return esCero;
	}
	
	double getHorasRecorridas(){
		double resultadoHs = 0;
		resultadoHs = this.kilometros / this.velocidad;
		return resultadoHs;
	}
}
