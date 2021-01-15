package Funcions;
/*Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA*/

import java.util.Scanner;

public class Ex6Funcions{


public static double iva(double preu)
{
  double afegit = 0.21;
  preu = preu + preu * afegit;
  return preu;

}

public static void main (String[]args){

Scanner llegir = new Scanner(System.in);

double preu[];
preu = new double[5];

System.out.println("Introdueix un preu"); //  Introduim 5 preus amb el bucle for
for (int i = 0; i < 5; i++){
preu[i] = llegir.nextInt(); //Les almacenenm a la variable preu
}


for (int i = 0; i < 5; i++){
System.out.println ("El preu amb l'IVA afegit es: " + iva(preu[i]));
}



}
}
