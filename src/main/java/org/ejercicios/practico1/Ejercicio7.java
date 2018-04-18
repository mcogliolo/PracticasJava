package org.ejercicios.practico1;

import java.util.Scanner;

/**
 * @author Mariela Cogliolo
 * Ejercicio n° 7
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular 
 * el perímetro de muchas circunferencias, utilizando la estructura while. 
 * Modificar además el ingreso de datos, utilizando la clase Scanner.
 *
 */

public class Ejercicio7 {
	public static void main(String[] args){
		
		Scanner radio = new Scanner(System.in);
		
		System.out.print("Escriba dos números dobles: ");
		double rad = radio.nextDouble();
		
		double perCirc = 2* Math.PI * rad;
		
		System.out.println("El perimetro de la cicunferencia con radio de "
				+ rad + " es de: " + perCirc);		
	}
}