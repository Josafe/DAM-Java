package Funcions;
/*16. Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios.
*/

import java.util.Scanner;
public class Ex16Funcions{

public static double aleatori (int array[], int tamany)
{
int i = tamany;
double resultat = 0;
for (i = 0; i < array.length - 1; i++)
{
resultat = (Math.random());
System.out.println(resultat);
}
return resultat;
}
public static void main (String[] args){

Scanner llegir = new Scanner(System.in);
int array[];
int tamany;
int i;
System.out.println("Introdueix el tamany de l'array");
tamany = llegir.nextInt();

array = new int[tamany];

System.out.println(aleatori(array,tamany));


}
}
