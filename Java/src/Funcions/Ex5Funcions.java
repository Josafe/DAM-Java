/*Escribe   un  programa   que   pida   un  valor   entero  en   millas   y   muestre   su   equivalente
   en kilómetros. Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:double
 millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros*/
package Funcions;
import java.util.Scanner;

public class Ex5Funcions{


public static double milla(int milles)
{
  double num = milles;
  double resultat = num * 1.6093;
  return resultat;
}

public static void main (String[]args){

Scanner llegir = new Scanner(System.in);

float km;
int milles = 1;

System.out.println("Introdueix una xifra en milles: "); //  Introduim milles
milles = llegir.nextInt(); //Les almacenenm a la variable milles




System.out.println("La conversio de milles  a km es: " + milla(milles));

}
}
