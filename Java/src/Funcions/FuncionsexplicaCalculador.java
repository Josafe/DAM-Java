package Funcions;

import java.util.Scanner;
public class FuncionsexplicaCalculador {
	
	public static int suma(int x, int y)
	{
		int res = x + y;
		
		return res;
	}

	public static int resta (int n1, int n2)
	{
		int res2 = n1 - n2;
		
		return res2;
	}

	public static int multi (int n1, int n2)
	{
		int res3 = n1 * n2;
	
		return res3;
	}

	public static float div (int n1, int n2)
	{
		int res4 = n1 / n2;
		
		return res4;
	}
	
	public static void main(String[] args) {
	
	//public static son modificadors, void es el valor de retorn "en este cas un valor nul", el main es el nom de la funcio, String args son  els arguments que introduirem a la funcio
	
	Scanner llegir = new Scanner (System.in);
	int n1;
	int n2;
	
	int resultat = 0;
	int resultat2 = 0;
	int resultat3 = 0;
	float resultat4 = 0;
	

	System.out.println("Introdueix un num");
	n1 = llegir.nextInt();
	
	System.out.println("Introdueix un num");
	n2 = llegir.nextInt();
	
	resultat = suma (n1 , n2);
	resultat2 = resta (n1 , n2);
	resultat3 = multi (n1 , n2);
	resultat4 = div (n1 , n2);
	
	System.out.println("La suma retorna: " + resultat);
	System.out.println("La resta retorna: " + resultat2);
	System.out.println("La multiplicacio retorna: " + resultat3);
	System.out.println("La divisio retorna: " + resultat4);
	
	
	
	
	}

}