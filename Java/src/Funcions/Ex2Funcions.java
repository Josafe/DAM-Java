package Funcions;
import java.util.Scanner;
public class Ex2Funcions {

	
	public static int edad(int n1)
	{
		if (n1 < 18)
		{
			System.out.println("Ets menor d'edad: " + n1);
		}
		else
		{
			System.out.println("Ets major d'edad: " + n1);
		}
		return n1;
	}
	
	public static void main(String[] args) {
	
	Scanner llegir = new Scanner(System.in);
		
	System.out.println("Introdueix la teva edad per teclat");
	
	System.out.println("Ex2: la edad es: ");
	int n1 = llegir.nextInt();
	
	int resultat = edad (n1);
	
	System.out.println(resultat);
	
}
}
