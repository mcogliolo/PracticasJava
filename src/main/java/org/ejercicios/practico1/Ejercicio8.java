package org.ejercicios.practico1;

import java.util.Scanner;

/**
 * Ejercicio n°8:
 *  Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
mayor nota con el mensaje respectivo.
 */
public class Ejercicio8 {
	public static void main(String[] args){
	
	int  = 1;
	
	Double[] = notas; 
	
	while (respuesta == 1) {		
		Scanner radio = new Scanner(System.in);
		System.out.print("Escriba el radio del perimetro a calcular: ");
		double rad = radio.nextDouble();
	
		double perCirc = 2* Math.PI * rad;
	
		System.out.println("El perimetro de la cicunferencia con radio de "
				+ rad + " es de: " + perCirc);	
	
		System.out.print(" ");
	
		Scanner ask = new Scanner(System.in);
		System.out.print("Desea continuar calculando un perimetro 1/2: ");
		int respuesta2 = ask.nextInt();
		respuesta = respuesta2;
	
	}		
	System.out.print("MUCHAS GRACIAS");		
}

}
