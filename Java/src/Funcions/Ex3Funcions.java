package Funcions;
import java.util.Scanner;
/*Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual esel mínimo.
 *  Implementa y utiliza la función:int minimo(int a, int b) // Devuelve el menor entre a y b*/
public class Ex3Funcions {
	
	public static int minim (int n1 , int n2)
	{
		int resultat;
		if (n1 < n2) 
		{
		resultat = n1;
		return n1;
		}
		else {		
		resultat = n2;
		return n2;
		}
	}
	public static void main (String[] args)
	{
		Scanner llegir = new Scanner(System.in);
		int resultat;
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Introdueix un 1r num: ");
		n1 = llegir.nextInt();
	
		System.out.println("Introdueix un 2n num: ");
		n2 = llegir.nextInt();
		System.out.println("El num mes petit es el primer que has introduit: " + n1);
	}
}
