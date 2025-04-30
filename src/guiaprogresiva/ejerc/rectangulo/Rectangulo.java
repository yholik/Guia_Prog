package guiaprogresiva.ejerc.rectangulo;

public class Rectangulo {
	public int codigo;
	public double base;
	public double altura;
	
	public int getCodigo() {
		return this.codigo;
	}
	public double getArea() {
		return this.base * this.altura;
	}
	
	public double getPerimetro(){
		return 2 * this.base + 2 * this.altura;
	}
	
	public boolean isCuadrado() {
		boolean esCuadrado = this.base == this.altura;
		return esCuadrado;
	}
	
	public double getMayorLado() {
		if(this.base > this.altura) {
			return this.base;
		}else {
			return this.altura;
		}
	}
	
}
