package org.ejercicios.practico1;

//Ejercicio n�3:
//Crear una clase denominada Circunferencia, que contenga el m�todo main(), 
//en el que se calcule el per�metro de una circunferencia, ingresando 
//el radio de tipo entero a trav�s del argumento del main().
//2*pi*r = perimetro de la circuferencia

public class Ejercicio3 {
	public static void main(String[] args){
		int radio = Integer.valueOf(args[0]);
		
		double perCirc = 2* Math.PI * radio;
		
		System.out.println("El perimetro de la cicunferencia con radio de "
				+ radio + " es de: " + perCirc);		
	}
}