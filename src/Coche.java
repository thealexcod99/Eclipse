/* Ejercicio 2.1 Clase Coche. */

public class Coche {
	
	private double combustible = 5;
	private double consumo = 7;
	
	public double getCombustible() {
		return combustible;
	}
	
	public void setCombustible(double combustible) {
		this.combustible = combustible;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public double kilometrosConCombustible() {
		return combustible / consumo * 100;
	}

	@Override
	public String toString() {
		return "Coche con " + combustible + "L de combustible y consumo de " + consumo + "L/100Km";
	}
	
	
}
