package Funcions;
/*Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n */

import java.util.Scanner;
public class Ex8Funcions{

public static int sumatori(int numero)
{
  int suma1aN = 1;
  int resultat = 1;
  for (int i = 0; i < numero; i++)
  {
  resultat += suma1aN;
  suma1aN++;
  }
  return resultat;
}
public static int productori(int numero)
{
  int produ1aN = 1;
  int resultat = 1;
  for (int i = 0; i < numero; i++)
  {
    resultat *= produ1aN;
    produ1aN ++;
  }
    return resultat;
}
public static double mitja(int numero)
{
  
  int media;

  media = numero / 2;

  return media;
}

public static void main(String[] args)
{
Scanner llegir = new Scanner(System.in);

int numero;

System.out.println("Introdueix un num");
numero = llegir.nextInt();

int resultat;
System.out.println("El sumatori es: " + sumatori(numero));
System.out.println("El productori es: " + productori(numero));
System.out.println("La mitja es:" + mitja(numero));
}
}
