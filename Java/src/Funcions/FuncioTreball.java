package Funcions;
import java.util.Arrays;
import java.util.Scanner;
public class FuncioTreball {
	
	public static void instruccions ()
	{
		System.out.println("------------");
		System.out.println("--PROGRAMA--");
		System.out.println("------------");
		System.out.println("No es podran crear variables ni prints al main, tampoc podras crear l'Scanner");
	}
	
	public static int[] vprim (int vcombinat[]) {
		
	}
	
	public static int vmax (int vcombinat[]) {
		
		int max = 0; 
		int i = 0;
		for (i = 0; i < vcombinat.length; i++) //Recorrerem l'array de 60 amb el .length
		{
			if (max < vcombinat[i]) { //Si el num de l'array es mes gran que la variable max aquesta igualara el seu valor i aixi succesivament conforme recorrem l'array
				
				max = vcombinat[i];
			}
		}
		return max;
	}
	
	public static int vmin (int vcombinat[])
	{
		
		int min = 0;
		int i = 0;
		for (i = 0; i < vcombinat.length; i++) //Recorrerem l'array completament amb la funcio .length
		{
			if (min > vcombinat[i]) //Si el num de l'array es mes petit que la variable min, aquesta s'igualara i aixi succesivament. 
			{
				min = vcombinat[i];
				
			}
		}
		return min;
	}
	public static int[] vordenat (int vcombinat[]){

		Arrays.sort(vcombinat);
		
		return vcombinat;
		
	}
	public static  int[] combi (int vsuma[], int vmulti[], int v[]) {
		
		int vcombinat[];
		vcombinat = new int[60];
		
		for (int i = 0; i < vcombinat[20]; i++)
		{
			vcombinat[i] = v[i];
		}
		for (int i = 20,j=0; i < vcombinat[40]; i++,j++) 
		{
			vcombinat[i] = vsuma[j];
		}
		for (int i = 40,j = 0; i < vcombinat.length; i++, j++)
		{
			vcombinat[i] = vmulti[j];
		}
		
		
		
	
		return vcombinat;
		
	}
	
	public static int multial (int x, int y) {
		
		int multiplicacio = 1;
		
		for (int i = x; i <= y; i++)
		{
			multiplicacio = multiplicacio * y;
		}
		return multiplicacio;
	}

	public static int[] vectormulti(int r1, int r2) { //Arreglar!!!
		int vmulti[];
		vmulti = new int [20];
		int x;
		int y;
		
		for (int i = 0; i < vmulti.length; i++)
		{
			x = (int) (Math.random()*r1+r2);
			y = (int) (Math.random()*r1+r2);
			vmulti[i] = multial(x,y);
		}
		
		return vmulti;
	}
	public static void multi (int vmulti[]) {
		
		for (int i = 0; i < vmulti.length; i++)
		{
			System.out.println("El vector multi [" + i + "] es igual a " + vmulti[i]);
		}
	}
	
	
	public static int sumaal (int x, int y) {

		int suma = 0;
		
		for (int i = x; i <= y; i++)
		{
		
		suma = suma + i;	
			
		}
		return suma;
	}
	
	
	public static int[] vectorsuma(int r1, int r2) {
		
		int vsuma[];
		vsuma = new int[20];
		int x;
		int y;
		
		for (int i = 0; i < vsuma.length;i++)
		{
			x = (int)(Math.random()*r1+r2); //Amb aquesta funcio sumarem el valor a de sumaal
			y = (int)(Math.random()*r1+r2); //Amb aquesta funcio sumarem el valor b de sumaal
			
			vsuma[i] = sumaal(x,y);
		}
		
		return vsuma;
	}
	
	
	
	public static void suma (int vsuma[]) { //Arreglar???
		
		
	}
	
	
	
	public static void mostravector(int s[]){ //Dona igual el nom de la variable ja que l'unic us d'aquesta funcio es mostrar vectors de tamany adaptable "en aquest cas estem mostrant
												//tant vectors de 20 com de 60 ja que fem us del s.length
		for (int i = 0; i < s.length; i++)
		{
			System.out.println("El vector[" + i + "] es igual a  " + s[i]);
		}
		
	}
	
	
	
	public static int[] vectoraleatori(int r1,int r2) {
		
		int v[];
		v = new int[20];
		
		for (int i = 0; i < v.length; i++) 
	{
			v[i] = (int)(Math.random()*r1+r2);
	}
		
		return v;
	}
	
	
	
	public static int aleatoris()
	{
		
		Scanner llegir = new Scanner(System.in);
		
		int random = 0; //Variable num random
		
		System.out.println("Introdueix un valor");
		random = llegir.nextInt();
	
		
		return random;
		
	}
	
	
	/*public static void numaleatoris(int nr1,int nr2)
	{
		nr1 = (int) (Math.random()*10+50);
		nr2 = (int) (Math.random()*50+100);
	}
	*/
	
	
	
	public static void main(String[] args){
		
		int r1; 
		int r2;
		
		int i = 0;
/*---------------------------------------------------------------------------------------------------------------------*/
		int v[]; //Vector de nº aleatoris
		v = new int[20]; //Tamany del vector de nº aleatoris
/*---------------------------------------------------------------------------------------------------------------------*/
		int vsuma[]; //Vector de la funcio SUMA
		vsuma = new int[20]; //Vector de la funcio SUMA
/*---------------------------------------------------------------------------------------------------------------------*/
		int vmulti[]; //Vector de la funcio MULTI
		vmulti = new int[20]; //Vector de la funcio MULTI
/*---------------------------------------------------------------------------------------------------------------------*/
		int vcombinat[]; //Vector de la funcio COMBINAT
		vcombinat = new int[60]; //Vector de la funcio COMBINAT = als vectors aleatoris suma i multi
/*---------------------------------------------------------------------------------------------------------------------*/		
		int vordenat[];
		vordenat = new int[60];
/*---------------------------------------------------------------------------------------------------------------------*/
		int vmaxim;
		int vmin;
/*---------------------------------------------------------------------------------------------------------------------*/
		instruccions(); //Funcio instruccions
/*---------------------------------------------------------------------------------------------------------------------*/
		r1 = aleatoris(); //S'almacenara el valor introduit a la funcio aleatoris x1
		r2 = aleatoris(); //S'almacenara el valor introduit a la funcio aleatoris x 2ª vegada
/*---------------------------------------------------------------------------------------------------------------------*/
		v = vectoraleatori(r1,r2); //Funcio vectoraleatori
		mostravector(v);
/*---------------------------------------------------------------------------------------------------------------------*/
		vsuma = vectorsuma(r1,r2); //Funcio vectorsuma
		mostravector(vsuma);
/*---------------------------------------------------------------------------------------------------------------------*/
		vmulti = vectormulti(r1,r2); //Funcio vectormulti
		multi(vmulti);
		mostravector(vmulti);
/*---------------------------------------------------------------------------------------------------------------------*/		
		vcombinat = combi (vsuma,vmulti,v); //El vector es la combinacio dels tres vectors que hem fet anteriorment, amb un tamany de 0-59
		mostravector(vcombinat); //Amb mostravector podem mostrar el vector dona igual la llargada que tingue ja que s'aplica amb .length
/*---------------------------------------------------------------------------------------------------------------------*/		
		vordenat = vordenat(vcombinat);
		mostravector(vordenat);
/*---------------------------------------------------------------------------------------------------------------------*/	
		vmaxim = vmax(vcombinat);
		System.out.println("El valor mes gran dintre del vector es: " + vmaxim);
/*---------------------------------------------------------------------------------------------------------------------*/
		vmin = vmin(vcombinat);
		System.out.println("El valor mes petit dintre del vector es: " + vmin);
	
	}
}
