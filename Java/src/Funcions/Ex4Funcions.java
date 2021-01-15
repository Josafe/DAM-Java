package Funcions;
/*Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo*/
import java.util.Scanner;

public class Ex4Funcions{
public static int numero (int n1)
{

int resultat = 0;

  if (n1 < 0)
  {
    resultat = -1;

  }
  else if (n1 == 0)
  {
    resultat = 0;

  }
  else if (n1 > 0)
  {
    resultat = 1;

  }
  return n1;
}

  public static void main (String[] args)
  {
    Scanner llegir = new Scanner(System.in);

    int n1, resultat;

    System.out.println("Introdueix un numero");
    n1 = llegir.nextInt();

    resultat = numero(n1);

    if (n1 < 0)
    {
      System.out.println("El num introduit es negatiu");
    }
    else if (n1 == 0)
    {
      System.out.println("El num introduit es igual a 0");
    }
    else
    {
      System.out.println("El num introduit es possitiu");
    }


  }
}
