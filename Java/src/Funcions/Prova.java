package Funcions;

public class Prova {

	
	public static void main (String[] args)
	{
		char tauler[][];
		tauler = new char [10][10];
	
		for (int i = 0; i < 100; i++)
		{

		int indexi = (int)(0 + Math.random()*tauler.length-1+0);	//Randomitzarem dues coordenades de la matriu
		int indexj = (int)(2 + Math.random()*7-2+1);

		System.out.println(indexi + " " + indexj);
	}
}
}
