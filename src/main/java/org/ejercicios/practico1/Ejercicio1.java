package org.ejercicios.practico1;

//Ejercicio n°1:
//Crear una clase que contenga el método main(). 
//En él declarar las variables a y b de tipo entero. 
//Inicializarlas con los valores 8 y 3 respectivamente.
//Realizar y mostrar por pantalla las siguientes operaciones aritméticas:
//	suma, resta, multiplicación, división y resto.

public class Ejercicio1 {
	
	public static void main (String[] args){
		
		int valor1 = 3;
		int valor2 = 8;
		
		int suma = valor1 + valor2;
		int resta = valor2 - valor1;
		int multiplicacion = valor1 * valor2;
		float division = valor2 / valor1;
		float resto = (valor2 - (division * valor1));
		
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicacion = " + multiplicacion);
		System.out.println("Division = " + division );
		System.out.println("Resto = " + resto );
	}
}