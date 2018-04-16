package org.ejercicios.practico1;

//Ejercicio n�4:
//Crear una clase que contenga el m�todo main(), declarar las variables a,
//b y c de tipo double, que corresponden a los lados de un tri�ngulo. 
//Los valores deben ser ingresados por teclado como argumentos del m�todo 
//main(). Calcular y mostrar el semiper�metro y el �rea del tri�ngulo con las
//siguientes f�rmulas:
//semiperimetro = (a+b+c)/2
//area = ra�z cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))
//Nota: probar con a=2, b=2.7, c=3.5

public class Ejercicio4 {
	public static void main(String[] args){
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		//Calculo del semiperimetro del triangulo
		double semiperimetro = (a+b+c)/2;
		
		//Calculo del area del triangulo
		double area = Math.sqrt(semiperimetro*(semiperimetro-a)*
				(semiperimetro-b)*(semiperimetro-c));
		
		System.out.println("El semiperimetro del triangulo es: " + semiperimetro
				+ " con sus lados a: " + a + " b: " + b + " c: " + c);
		
		System.out.println("El area del triangulo es: " + area);
	}
}