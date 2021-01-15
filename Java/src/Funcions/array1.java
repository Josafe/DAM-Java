package Funcions;
import java.util.Scanner;
public class array1{

public static int[][] matriu2 (int n1, int n2)
{
  Scanner llegir = new Scanner(System.in);
  int matriu[][];

  System.out.println("Introdueix un numero per a definir les files");
  n1 = llegir.nextInt();

  System.out.println("Introdueix un numero per a definir les columnes");
  n2 = llegir.nextInt();

  matriu = new int[n1][n2];

  int j = 0;

  int array = 0;

  double mitja = 0;

  for (int i = 0; i < matriu.length; i++)
  {
    for (j = 0; j < matriu[i].length; j++)
    {
      System.out.println("Introdueix un numero per almacenar a l'array");
      array = llegir.nextInt();
      System.out.println("A la columna [" + i + "] de la fila [" + j + "] has introduit: " + array);

      mitja += array;
    }

    mitja = mitja / n2;
    System.out.println("La mitjana de cigarros fumats es: " + mitja);
  }
  return matriu;
}
public static int taulamulti (int bidi[][], int taula){

  taula = 1;
  int resultat = 0;
  bidi = new int[10][10];

  for (int i = 1; i < bidi.length; i++)
  {
      for (int j = 1; j < bidi[i].length; j++)
      {
        resultat = i * j;
        System.out.println("La taula del [" + i + "] per [" + j + "] dona igual a: " + resultat);
      }

  }
  return resultat;
}
public static void piramide (int base, String lletra){

Scanner llegir = new Scanner(System.in);
System.out.println("Introdueix el tamany de la base");
base = llegir.nextInt();

lletra = "P";

for (int i = 1; i < base; i++)
{
  for (int j = base; j > i; j--)
  {
    System.out.println(" ");
  }
  for (int k = 1; k < i; k++)
  {
    System.out.println(lletra + " ");
  }
  System.out.println();
}

}
public static int funcio1(int funcionum)
{
System.out.println("Funcio");
int sumatori = 0;

for (int i = 0; i < funcionum; i++)
{
  sumatori += i;
  System.out.println("El sumatori del numero introduit es:  " + sumatori);
}
return sumatori;
}

public static int funcio2(int funcionum)
{
  int factorial = 1;

  for(int i = 1;i < funcionum; i++)
  {
    factorial *= i;
    System.out.println("El factorial del numero introduit es: " + factorial);
  }
  return factorial;
  }

public static int[] invers (int n1, int parell[], int invers[])
{
  n1 = 0;
  parell = new int [100];
  invers = new int [100];
  int i = 0;

  for (i = 0; i < parell.length - 1; i++)
  {
    parell[i] = n1;
    n1++;
  }

  n1 = 100;

  for (int j = 0; j < parell.length; j++){
    invers[j] = n1;
    n1--;
    System.out.println(invers[j]);
    }
  return invers;
}


public static int[] vector (int n1, int parell[])
{
  		n1 = 0;
  	  parell = new int [100];

  		for (int i = 0; i < parell.length; i++)
      {
        parell[i] = n1;
        n1++;
        System.out.println(parell[i]);
      }
      return parell;
}

public static void funcioString (String frase)
{
  System.out.println("-----------------Funcions String-----------------");

  String frase2 = "Me fumo un cigarret";
  String frase3 = "me fumo un cigarret";
  int out = frase2.compareTo(frase3);

  System.out.println("La llargada de la frase fet amb variable.length() es: " + frase.length());
  System.out.println("Retorna el caracter que esta a la posicio 0 a 6 amb variable.charAt(5) : " + frase.charAt(5));
  System.out.println("Retorna la cadena de caracters a partir del 3 amb variable.substring(2): " + frase.substring(2));
  System.out.println("Per a concatenar dos frases farem servir el variable.concat(variable): " + frase.concat(frase2));
  System.out.println("Per a sapiguer el num de caracters des de la posicio 0 fins la paraula la paraula introduida amb variable.indexOf('paraula'): " + frase2.indexOf("un"));
  System.out.println("Per a retornar la posicio de l'ultim caracter farem servir variable.indexOf('lletra')" + frase2.indexOf('a',0));
  System.out.println("Per a comprovar si una frase es igual a l'altra ignorant majuscules amb variable.equalsIgnoraCase(variable): " + frase2.equalsIgnoreCase(frase3));
  System.out.println("Per a comprovar si una frase es igual a l'altra amb variable.equals(variable): " + frase2.equals(frase3));
  System.out.println("Per a comparar dues cadenes de text crearem un integer on almacenarem la comprovacio de les frases, variable = frase.compareTo(frase)" + out);
  System.out.println("Per a comparar dues cadenes de text ignorant majuscules farem el mateix amb la sequencia, variable = frase.compareToIgnoreCase(frase): " + out);
  System.out.println("Per a convertir tots els caracters del string en minuscules farem us de, frase.toLowerCase(): " + frase2.toLowerCase());
  System.out.println("Per a convertir tots els caracteres del String en MAJUSCULES farem us de, frase.toUpperCase(): " + frase2.toUpperCase());
  System.out.println("Per a copiar una cadena de text eliminiant els espais en blanc farem us de, frase.trim(): " + frase2.trim());
  System.out.println("Per a reemplaçar un caracter de la cadena de text farem us de, frase.replace('c' , 'p'): " + frase2.replace('c' , 'p'));

}

public static void funcioMath (int n1, int n2, double n3){
System.out.println("-------------------Funcions Math--------------------");

  n1 = 5;
  n2 = 10;
  n3 = 2.5;

  System.out.println("Per a calcular la tangent farem servir la funcio, Math.tan(variable): " + Math.tan(n1));
  System.out.println("Per a calcular el seno farem servir la funcio, Math.sin(variable): "+ Math.sin(n1));
  System.out.println("Per a calcular el coseno farem servir la funcio, Math.cos(variable: )" + Math.cos(n1));
  System.out.println("Per a calcular un numero elevat farem servir la funcio, Math.pow(variable, variable)" + Math.pow(n2,n1));
  System.out.println("Per a calcular el num mes gran entre 2 num introduits farem servir la funcio, Math.max(variable, variable): " + Math.max(n1,n2));
  System.out.println("Per a arrodonir un num farem servir la funcio Math.round(variable): " + Math.round(n3));
  System.out.println("Per a arrodonir un num cap amunt farem servir la funcio Math.floor(variable): " + Math.floor(n3));
  System.out.println("Per a arrodonir un num cap avall farem servir la funcio Math.ceil(variable): " + Math.ceil(n3));
  System.out.println();
}

public static String oracio (String frase)
{
  frase = "Holagente";
  return frase;
}

public static void main(String[] args){
System.out.println("-----------------------------------------");
System.out.println("--------------PROGRAMA MAIN--------------");
System.out.println("-----------------------------------------");

Scanner llegir = new Scanner(System.in);

System.out.println("-----------------------------------------");

boolean sortir = true;
int Calculadora = 0;

int numsw1 = 0;
int numsw2 = 0;

int restasw;
int multisw;
int divsw;
int sumasw;

System.out.println("-----MENU-----");

System.out.println("Introdueix un numero");
numsw1 = llegir.nextInt();

System.out.println("Introdueix un altre numero");
numsw2 = llegir.nextInt();

System.out.println("Selecciona una opcio:  \n1 Suma dels digits introduits \n2 Resta dels digits indroduits \n3 Multiplicacio dels digits introduits \n4 Divisio dels digits introduits \n5 Sortir");
Calculadora = llegir.nextInt();

switch (Calculadora){

  case 1:

  sumasw = numsw1 + numsw2;
  System.out.println("El resultat de la suma es igual a: " + sumasw);
  break;

  case 2:

  restasw = numsw1 - numsw2;
  System.out.println("El resultat de la resta es igual a: " + restasw);
  break;

  case 3:

  multisw = numsw1 * numsw2;
  System.out.println("El resultat de la multiplicacio es igual a: " + multisw);
  break;

  case 4:

  divsw = numsw1 / numsw2;
  System.out.println("El resultat de la divisio es igual a: " + divsw);
  break;

  case 5:

  System.out.println("Has sortit de la calculadora");
  sortir = false;

  if (sortir = false)
  {
    break;
  }
}



System.out.println("-----------------------------------------");

int taula = 0;

int base = 0;
String lletra = "H";

String frase = "iniciat";
int i;
int j;

int parell[];
parell = new int[100];

int invers[];
invers = new int[100];

System.out.println("Funcio math");
int n1 = 0;
int n2 = 0;
int n3 = 0;
int math;

System.out.println("Array Bidimensional");
int bidi [][];

int nota = 0;
double notamitja = 0;
int num1; //Variable files
int num2; //Variable columnes

System.out.println("Funcions Sumatori i factorial");
int numsuma; //Variable sumatori / multiplicador
int contador = 1;
int resultatsuma = 1;


System.out.println("Introdueix un num per a fer el sumatori");
numsuma = llegir.nextInt();

int resultatmulti = numsuma;

for (i = 1; i < numsuma; i++)
{
  resultatsuma += i;
  resultatmulti *= i;
  System.out.println("El sumatori es: " + resultatsuma);
  System.out.println("El factorial es: " + resultatmulti);
}

System.out.println("-----------------------------------------");
System.out.println("Array bidimensional mitja alumnes");

System.out.println("Introdueix num1 (num de files)");
num1 = llegir.nextInt();
System.out.println("Introdueix num2 (num de columnes)");
num2 = llegir.nextInt();

bidi = new int [num1][num2]; //Array creada amb files (num1) i columnes (num2)

for (i = 0; i < bidi.length; i++)
{

  for (j = 0; j < bidi[i].length; j++)
  {

    System.out.println("Introdueix la nota del alumne " + i);
    nota = llegir.nextInt();
    System.out.println("A l'alumne [" + i + "] li has introduit [" + nota + "]");
    notamitja += nota;


  }
  notamitja = notamitja / j;
  System.out.println("La nota mitja es: " + notamitja);
  notamitja = 0;
}
for (i = 0; i <bidi.length; i++)
{

}

System.out.println("-----------------------------------------");
System.out.println("Funcions Math");

System.out.println("Funcio math.random");
math = (int) (Math.random()*5+150); // Num random integro entre 1-150
System.out.println(math);

System.out.println("-----------------------------------------");
System.out.println("Funcio math.round");

double numround;
double numround2;

System.out.println("Introdueix un num decimal cap amunt");
numround = llegir.nextDouble();

System.out.println("Introdueix un num decimal cap avall");
numround2 = llegir.nextDouble();


Math.round(numround2);

System.out.println("Num arrodonit" + Math.round(numround));
System.out.println("Num arrodonit" + Math.round(numround2));

System.out.println("-----------------------------------------");
System.out.println("Funcio math.sqrt (arrel quadrada)");

int numarrel = 0;
System.out.println("Introdueix un num per a treure la seva arrel quadrada");
numarrel = llegir.nextInt();
System.out.println("Arrel quadrada del num introduit es: " + Math.sqrt(numarrel));

System.out.println("-----------------------------------------");
System.out.println("Sinus, Cosinus, Tangent");

double angle;

System.out.println("Introdueix un angle");
angle = llegir.nextInt();

System.out.println(Math.sin(angle));
System.out.println(Math.cos(angle));
System.out.println(Math.tan(angle));

System.out.println("-----------------------------------------");
System.out.println("Funcio");

System.out.println("Introdueix un num per a tornar el sumatori / factorial");
int funcionum = llegir.nextInt();

System.out.println(funcio1(funcionum));
System.out.println(funcio2(funcionum));

System.out.println(oracio(frase));

funcioString(frase);
funcioMath(n1,n2,n3);

System.out.println(vector(n1,parell));
System.out.println(invers(n1,parell,invers));

piramide(base,lletra);

System.out.println(taulamulti(bidi,taula));

System.out.println(matriu2(n1,n2));
}
}
