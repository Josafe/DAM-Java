package Funcions;

/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir dos parámetros:
 *el carácter que se desea imprimir y el número de líneas del triángulo.*/

import java.util.Scanner;
public class Ex14Funcions {

	public static void piramid (int piramide, char caracter)
	{
		for (int i = 1; i < piramide; i++)
		{
			for (int k = 1; k > piramide; k++)
			{
				System.out.println(caracter);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner llegir = new Scanner(System.in);
		
		int piramide = 0;
		char caracter;
		
		
		System.out.println("Introdueix el numero de la base de la piramide ");
		piramide = llegir.nextInt();
		
		System.out.println("Introdueix el caracter amb el que es creara la piramide");
		caracter = llegir.next().charAt(0);
		
		piramid (piramide, caracter);	
	}
}
