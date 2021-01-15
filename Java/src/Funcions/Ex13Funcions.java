package Funcions;
/*Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
 * Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado.
 * Se debecrear una función a la que le pasemos ambos valores y nos devuelva el descuento.*/
import java.util.Scanner;
public class Ex13Funcions {

	
	public static double descuento (double preudescompte, double preu)
	{
		
		double descompte = preudescompte / preu * 100;
		return descompte;
	}
	public static void main(String[] args)
	{
		Scanner llegir = new Scanner(System.in);
		
		double preu = 0;
		double descompte = 0;
		double preudescompte = 0;
		
		System.out.println("Introdueix un preu");
		preu = llegir.nextInt();
		
		System.out.println("Introdueix un preu amb el descompte aplicat");
		preudescompte = llegir.nextInt();
		
		System.out.println("El preu sense el descompte es: " + preu);
		System.out.println("El descompte es: " + descuento(preudescompte,preu));
		
	}
}
