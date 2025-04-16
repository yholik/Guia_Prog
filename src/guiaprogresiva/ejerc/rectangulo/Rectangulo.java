package guiaprogresiva.ejerc.rectangulo;

public class Rectangulo {
	int codigo;
	double base;
	double altura;
	
	double getArea() {
		return this.base * this.altura;
	}
	
	double getPerimetro(){
		return 2 * this.base + 2 * this.altura;
	}
	
	boolean isCuadrado() {
		
		//Es mejor no usar if dentro de metodos
		if(base == altura) {
			return true;
		}else {
			return false;
		}
		
		//TAMBIEN PUEDE SER ASI
		/* boolean isCuadrado(){
		 * boolean resultado = this.base == this.altura;
		 * return resultado;
		 * }
		 * 
		 */
	}
}
