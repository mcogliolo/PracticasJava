package org.ejercicios.practico1;

import java.util.Scanner;

/**
 * Ejercicio n°8:
 *  Crear una clase denominada OperarVector que permita ingresar por teclado (Scanner) 5 notas de alumnos, las
 * que serán almacenadas en un array de enteros. Calcular el promedio y determinar la mayor nota. El promedio
 * debe permitir resultado con decimales (aplicar cast a los elementos enteros cuando sea necesario para obtener
 * dicho resultado). Mostrar los elementos ingresados, separados por un tabulador. Mostrar el promedio y la
 * mayor nota con el mensaje respectivo.
 */
public class Ejercicio8 {
	public static void main(String[] args){
		Scanner notasx = new Scanner(System.in);
		
		int[] notas = new int[5];		
		for(int i=0; i<notas.length;i++){
			System.out.print("Ingrese la nota: ");
			notas[i] = Integer.valueOf(notasx.nextInt());
		}
		int suma = 0;
		int mayorNota = notas[0];
		System.out.print("Las notas son las siguiente: " );
		for(int i=0; i<notas.length;i++){
			suma = suma + notas[i];
			if(notas[i]>mayorNota){
				mayorNota = notas[i];
			}
			System.out.print(notas[i]+"|");
		}
		double promedio = suma/notas.length;

		System.out.println("\nEl promedio es: " + promedio);
		System.out.println("La Mayor nota es: " + mayorNota);
		}
}

		
		