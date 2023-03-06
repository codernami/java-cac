/*
4)Crear la clase Perro en java, teniendo en cuenta que sus atributos son: nombre, raza, altura; 
y sus métodos: ladrar(), caminar(), saltar(), recobrar(). Generar el método constructor, 
los getters y setters correspondientes y el método toString.
 */
package Perro;

/**
 *
 * @author Amanda
 */
public class AppPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Bobby", "Siberiano",80);
        System.out.println(perro1);
        System.out.println(perro1.Ladrar());
        System.out.println(perro1.Caminar());
        System.out.println(perro1.Saltar());
        System.out.println(perro1.Recobrar());
    }
    
}
