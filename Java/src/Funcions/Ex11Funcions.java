package Funcions;
/*11.Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre porpantalla la tabla de multiplicar de dicho número.*/

import java.util.Scanner;
public class Ex11Funcions{

public static int taulamulti (int num, int taula){
int resultat = 0;

for (int i = 0; i < taula; i++)
{
  resultat = num * taula;
  System.out.println("La seva taula es: [" + num + "] * [" + taula + "] = " + resultat);
  num ++;
}
return resultat;
}

public static void main(String[] args){
Scanner llegir = new Scanner(System.in);

int num = 1;
int taula;

int i = 0;

System.out.println("Introdueix un numero per a mostrar la seva taula de multiplicar");
taula = llegir.nextInt();

System.out.println(taulamulti(num,taula));
}
}
