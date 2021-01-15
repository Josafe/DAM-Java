package Funcions;
/*17. Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.*/

import java.util.Scanner;
public class Ex17Funcions{

public static void prim(int num, int resultat){


if (num == 1)
{
  System.out.println("El numero introduit es 1 i no es calculable");
}
else if (num % 2 == 1){
System.out.println("El numero es prim");
}
else {
System.out.println("El numero es parell");
}

}
public static void main (String[] args){
Scanner llegir = new Scanner(System.in);

int num = 0;
int resultat = 0;
System.out.println("Introdueix un numero");
num = llegir.nextInt();

prim(num, resultat);
}
}
