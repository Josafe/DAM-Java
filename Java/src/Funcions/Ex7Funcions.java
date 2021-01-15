package Funcions;
  /*Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área*/

import java.util.Scanner;
public class Ex7Funcions{

public static double perimetre(double amplada, double llargada)
{
  double perimetro = (amplada + llargada) * 2;
  return perimetro;
}

public static double area (double amplada, double llargada)
{
  double area_ = amplada * llargada;
  return area_;
}

public static void main (String[] args){

Scanner llegir = new Scanner(System.in);
int rectancle = 0;
double amplada = 0;
double llargada = 0;

System.out.println("Introdueix l'amplada del rectangle");
amplada = llegir.nextInt();
System.out.println("Introdueix la llargada del rectangle");
llargada = llegir.nextInt();

System.out.println(perimetre(amplada,llargada));
System.out.println(area(amplada,llargada));

}
}
