package proyecto;

import java.util.Arrays;

public class Test_Pila {

	public static void main(String[] args) {
		
		PilaEnteros libros = new PilaEnteros (5);
		
		libros.push(3);
		libros.push(6);
		libros.push(8);
		
		System.out.println(libros);
		System.out.println("========================================");
		System.out.println();
		System.out.println(Arrays.toString(libros.pila));
	}

}
