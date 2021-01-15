package Funcions;

import java.util.Arrays;
import java.util.Scanner;

public class funciomatriu{

public static int[][] plenar (int matriu[][], int num){
	Scanner llegir = new Scanner(System.in);
  num = 0;
  int i = 0;
  int j = 0;
  
  for (i = 0; i < matriu.length; i++){

    for (j = 0; j < matriu[i].length; j++)
    {
      System.out.println("Introdueix un numero per a la posicio [" + i + "] i la columna [" + j + "]");
      matriu[i][j] = llegir.nextInt();
      
    }
  }
  return matriu;
}

	

public static void main(String[] args){

	Scanner llegir = new Scanner(System.in);
int matriu[][];
matriu = new int[4][4];
int num = 0;
int Menu = 0;
int plenar;


System.out.println("Introdueix un numero: \n1 Plenar tota la matriu de numeros \2 Sumar una fila \n3 Sumar una columna \n4 Sumar la diagonal de la matriu \n5 Sumar la diagonal inversa \n6 La mitja de tots els valors \7 Sortir");
Menu = llegir.nextInt();

switch (Menu) {

	
  case 1:
	  
	  matriu = plenar(matriu,num);
	  for (int i = 0; i < matriu.length; i++) {
		  for (int j = 0; j < matriu[i].length; j++) {
			  System.out.println(matriu[i][j]);
		  }
	  }
	
}
}

}
