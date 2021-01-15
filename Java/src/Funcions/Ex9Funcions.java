package Funcions;
/*Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.*/

import java.util.Scanner;
public class Ex9Funcions{


public static int max (int n1, int n3){

  int numeromax;
  if (n1 < n3)
  {
    numeromax = n3;
  }
  else
  {
    numeromax = n1;
  }
  return numeromax;
}

public static void main(String[] args){
Scanner llegir = new Scanner(System.in);

int n1;
int n2;
int n3;

System.out.println("Introdueix un num");
n1 = llegir.nextInt();
System.out.println("Introdueix un num");
n2 = llegir.nextInt();
System.out.println("Introdueix un num");
n3 = llegir.nextInt();

if (n1 < n2)
{
  n1 = n2;
}
else if (n2 < n1)
{
  n2 = n1;
}

System.out.println("El numero mes gran es: " + max(n1,n3));
}
}
