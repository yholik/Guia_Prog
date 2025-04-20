package guiaprogresiva.ejerc.rectangulo;

public class Rectangulo {
	int codigo;
	double base;
	double altura;
	
	int getCodigo() {
		return this.codigo;
	}
	double getArea() {
		return this.base * this.altura;
	}
	
	double getPerimetro(){
		return 2 * this.base + 2 * this.altura;
	}
	
	boolean isCuadrado() {
		boolean esCuadrado = this.base == this.altura;
		return esCuadrado;
	}
	
	double getMayorLado() {
		if(this.base > this.altura) {
			return this.base;
		}else {
			return this.altura;
		}
	}
	
}
