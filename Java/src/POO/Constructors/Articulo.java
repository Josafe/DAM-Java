package POO.Constructors;
public class Articulo
{
String nombre;
int precio;
int iva;
int stock;
double pvp;

public Articulo(String nombre, int precio, int iva, int stock){
	
	if(nombre == "") {
		System.err.println("Error, el nom no pot estar buit");
	}
	else if(precio <= 0) {
		System.err.println("Error, el preu no pot ser menor a 0");
	}
	else if(iva != 21) {
		System.err.println("Error, l'IVA español es 21%");
	}
	else if (stock < 0) {
		System.err.println("Error, no pot haver stock negatiu");
	}
	else {
	this.nombre = nombre;
	this.precio = precio;
	this.iva = iva;
	this.stock = stock;
	}
}
}
