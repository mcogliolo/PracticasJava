package org.ejercicios.practico1;

/**
 * Ejercicio n°6
 * Crear una clase denominada TrianguloRectangulo, que contenga el método main(), 
 * en el que se determine si un triangulo es rectángulo 
 *(Teorema de Pitágoras h2 = cateto12 + cateto22). 
 * Los lados se deben ingresar por teclado, utilizando el argumento del main().
 * Nota: probar con hipotenusa = 5; cateto1 = 3; cateto2 = 4;
 */
public class Ejercicio6 {
	public static void main(String[] args){
		
		double cateto1 = Double.parseDouble(args[0]);
		double cateto2 = Double.parseDouble(args[1]);
		double hipotenusa = Double.parseDouble(args[2]);
		
		double cateto11 = Math.pow(cateto1, 2);
		double cateto22 = Math.pow(cateto2, 2);
		
		double sumaCatetos = cateto11+cateto22;
		
		double hipotenusa2 = Math.pow(hipotenusa, 2);
	
		if (hipotenusa2 == sumaCatetos){
			System.out.println("El triangulo es Rectangulo");
		} 
		else {
			System.out.println("El triangulo NO es Rectangulo");
		}
	}
}
