package Funcions;
/*15 Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array.*/

public class Ex15Funcions{

public static int resultatsuma (int array[] , int suma)
{
int j;
  for (j = 0; j < array.length; j++)
  {
  suma += array[j];
  System.out.println(suma);
  }
  return suma;
}
public static int resultatmitja (int array[], int suma){ //INCOMPLET!!!
  int i;
    for (i = 0; i < array.length; i++)
    {
    	suma += array[i];
    }
    suma = suma / array.length;
    return suma;
}

public static void main (String[] args)
{
int array[];
int i = 0;
int j = 0;
array = new int[100];

for (i = 0; i < array.length; i++)
{
array[i] = (i+1);
System.out.println(i);
}
int suma = 0;

System.out.println(resultatsuma(array, suma));
System.out.println(resultatmitja(array, suma));
}
}
