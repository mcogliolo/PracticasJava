package org.ejercicios.practico1;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

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
		
		
		int respuesta = 1;
		
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