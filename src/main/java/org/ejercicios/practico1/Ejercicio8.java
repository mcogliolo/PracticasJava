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
	
	//Scanner nota = new Scanner(System.in);
	int[] nota = new int[4];
	
	nota[0] = 5;
	nota[1] = 5;
	nota[2] = 5;
	nota[3] = 5;
	nota[4] = 5;
	
	double promedio; 
	for(int i=0; i<nota.length; i++){
				
		promedio = (nota[i] + nota [i++])/nota.length;
	}
		
	
	
	System.out.print("Promedio" + promedio);
	
//	
//	int[] a = { nota1 , nota2 , nota3, nota4, nota5 };
//	
//	int nota1 = Double.parseDouble(args[0]);
//	int nota2 = nota.nextDouble();
//	int nota3 = nota.nextDouble();
//	int nota4 = nota.nextDouble();
//	int nota5 = nota.nextDouble();
//	
//
//	int[] a = { nota1 , nota2 , nota3, nota4, nota5 };
//	
//	
//	while (respuesta == 1) {		
//		Scanner radio = new Scanner(System.in);
//		System.out.print("Escriba el radio del perimetro a calcular: ");
//		double rad = radio.nextDouble();
//	
//		double perCirc = 2* Math.PI * rad;
//	
//		System.out.println("El perimetro de la cicunferencia con radio de "
//				+ rad + " es de: " + perCirc);	
//	
//		System.out.print(" ");
//	
//		Scanner ask = new Scanner(System.in);
//		System.out.print("Desea continuar calculando un perimetro 1/2: ");
//		int respuesta2 = ask.nextInt();
//		respuesta = respuesta2;
//	
//	}		
//	System.out.print("MUCHAS GRACIAS");		
//}
	}

}
