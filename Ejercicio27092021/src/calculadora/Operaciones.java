package calculadora;

public class Operaciones implements Calculadora{
	
	Calculadora suma = (x,y) -> x+y;
	Calculadora resta = (x,y) -> x-y;
	Calculadora mult = (x,y) -> x*y;
	Calculadora div = (x,y) -> x/y;
	
	
	


	public Operaciones() {
		super();
	}





	public double operaciones(double x, double y) {
		return 0d;
	}
}
