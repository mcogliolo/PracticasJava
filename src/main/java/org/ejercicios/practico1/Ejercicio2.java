package org.ejercicios.practico1;

//Ejecicio n°2
//Crear una clase que contenga el método main(), en el que se determinen
//y muestren por pantalla los números múltiplos de 4 a partir de 42 y
//hasta el 150 inclusive. Usar la sentencia de bucle más apropiada.

public class Ejercicio2 {
	
	public static void main(String[] args){

		int limite = 42;

		while(limite <= 150){			
//			int resultado2 = (limite/4);
//			int resto = limite - (4 * resultado2);
//				if(resto == 0)
//					System.out.println(limite + " es multiplo de 4");	
			if (limite % 4 == 0) System.out.println(limite + " es multiplo de 4");
			limite ++;			
		}
	}
}