package guiaprogresiva.ejerc.rectangulo;

public class Rectangulo {
	int codigo;
	double base;
	double altura;
	
	double getArea() {
		return base * altura;
	}
	
	double getPerimetro(){
		return 2 * base + 2 * altura;
	}
	
	boolean isCuadrado() {
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
