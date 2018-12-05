/* Test ejercicio 2.1 Clase Coche. */

public class TestCoche {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setCombustible(10);
		c2.setCombustible(15);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.printf("El coche 1 puede recorrer %.2fKm con %.2fL de combustible consumiendo %.2fL/100Km%n", c1.kilometrosConCombustible(), c1.getCombustible(), c1.getConsumo());
		System.out.printf("El coche 2 puede recorrer %.2fKm con %.2fL de combustible consumiendo %.2fL/100Km%n", c2.kilometrosConCombustible(), c2.getCombustible(), c2.getConsumo());
	}

}
