package org.ejercicios.practico1;

//Ejercicio n°5:
//Crear una clase denominada Ecuacion que contenga el método main() y que calcule las raíces 
//reales de una ecuación de segundo grado. Los valores de los coeficientes a, b y c se ingresarán 
//por teclado como argumentos del método main(). Considerar que si discriminante > 0 se deben 
//calcular las 2 raíces, si discriminante = 0 se debe calcular una sola raíz, especificando por
//pantalla que x1 = x2. En caso de ser negativo, mostrar un mensaje indicando que se encuentra frente
//a una solución compleja (numero imaginario).
//Nota: probar con a= -1; b=500; c=-62500;

public class Ejercicio5 {
	public static void main(String[] args){
		
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		
		double discriminante = (Math.pow(b, 2) - (4*a*c));
		
		if (discriminante > 0){
			double x1 = (-b + Math.sqrt(discriminante))/(2*a);
			double x2 = (-b - Math.sqrt(discriminante))/(2*a);
			System.out.println("La raices son: x1 = " + x1 + " x2 = " + x2);
		}
		else if (discriminante == 0){
			double x1 = (-b + Math.sqrt(discriminante))/(2*a);
			System.out.println("Las raices son iguales: " + x1);
		}
		else {
			System.out.println("La operacion que intenta realizar posee una solucion compleja "
					+ "(numero imaginario)");
		}			
	}
}