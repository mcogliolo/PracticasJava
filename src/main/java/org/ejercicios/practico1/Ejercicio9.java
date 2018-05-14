package org.ejercicios.practico1;

import java.util.Scanner;

/**
 * Ejercicio n°9
 * Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos dobles, y
almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del vector de
menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar sentencia FOR para el
ingreso de datos. Utilizar método de la Burbuja.
 * 
 * 
 * 
 */


public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner numerox = new Scanner(System.in);
		
		double[] numero = new double[4];		
		for(int i=0; i<numero.length;i++) {
			System.out.print("Ingrese un numero: ");
			numero[i] = Double.valueOf(numerox.nextDouble());
		}
		
		double menorValor = numero[0];
		System.out.print("Los numero ingresados son los siguientes: " );
		for(int i=0; i<numero.length;i++) {
			if(numero[i] < menorValor) {
				menorValor = numero[i];
			}
			
			System.out.print(numero[i]+"|");
		}
		System.out.println("\nEl numero con menor valor es: " + menorValor);
		
		int i, j; 
		double aux;
		for(i=0;i<numero.length-1;i++)  {
         for(j=0;j<numero.length-i-1;j++)
              if(numero[j+1]<numero[j]){
                 aux= numero[j+1];
                 numero[j+1]=numero[j];
                 numero[j]=aux;
              }
         
     	
 		System.out.print(numero[j]+"|");
		}
		
	}

}
