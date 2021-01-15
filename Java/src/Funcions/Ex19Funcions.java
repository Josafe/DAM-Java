/*19.Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
 * 	a la ecuación de Pitágoras: x ² + y ² = z ².
 *  El programa solicita al usuario los valores x, y, z.
 *  Se deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.Por ejemplo: 3 ² + 4 ² = 5 ².*/

package Funcions;
import java.util.Scanner;
public class Ex19Funcions {
	
	public static boolean pitagoras(int c, int d)
	{
		boolean pitagoras;
		if (d == c)
		{
			pitagoras = true;
			System.out.println("El numero introduit es igual: " + pitagoras);
		}
		else {
			pitagoras = false;
			System.out.println("El numero introduit no es igual: " + pitagoras);
		}
		return pitagoras(c,d);
		
	}
	
	public static void main(String[]args) {
	
		Scanner llegir = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = a + b;
		
		boolean pitagoras;
		
		System.out.println("Introdueix la xifra A");
		a = llegir.nextInt();
		a = a*a;
		
		System.out.println("Introdueix la xifra B");
		b = llegir.nextInt();
		b = b*b;
		
		System.out.println("Introdueix la xifra C");
		c = llegir.nextInt();
		c = c*c;
		
		
	}
	

}
