/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no.*/
package Funcions;
import java.util.Scanner;
public class Ex10Funcions
{
public static int data (int dia, int mes, int any){
int fecha = 0;

  if (dia == 16)
  {
	  fecha++;
    if (mes == 11)
    {
    	fecha++;
      if (any == 2020)
      {
        fecha++;
      }
    }
  }
  return fecha;
}

public static void main(String[] args){
Scanner llegir = new Scanner(System.in);

int dia = 16;
int any = 2020;
int mes = 11;

int fecha = 0;

System.out.println("Introdueix el dia");
dia = llegir.nextInt();

System.out.println("Introdueix el mes");
mes = llegir.nextInt();

System.out.println("Introdueix l'any");
any = llegir.nextInt();

if (data(dia,mes,any) ==  3)
  {
    System.out.println("La data introduida es correcta");
  }
  else if (fecha != 3)
  {
    System.out.println("La data introduida es incorrecta");
  }

}
}
