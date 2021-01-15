package POO.Constructors;
public class Articulo_UD8{
public static void main (String[] args)
{

Articulo coche = new Articulo("Audi" , 12000 , 21, 4);

coche.pvp = coche.precio + coche.precio * 0.21;

System.out.println("El model " + coche.nombre + " te un preu de " + coche.precio + "E sense IVA i " + coche.pvp + "E amb IVA inclos, ens queden " + coche.stock + " unitats en Stock" );

}
}
