package Funcions;
/*.Realiza un programa que dado un valor en kilómetros nos lo traduce a millas.
 *El programa debetener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva enmillas.*/
import java.util.Scanner;

public class Ex12Funcions {
	
	public static double milla (int km, double millas)
	{

		for (int i = 0; i < km; i++)
		{
			millas = km * 0.6214;
		}
		return millas;
	}
	
	public static void main(String[] args)
	{
		Scanner llegir = new Scanner(System.in);
		
		int km = 0;
		double millas = 0;
		
		System.out.println("Introdueix un valor en KM");
		km = llegir.nextInt();
		
		System.out.println("La conversio de km a milles es: " + milla(km,millas));
	}
	

}
