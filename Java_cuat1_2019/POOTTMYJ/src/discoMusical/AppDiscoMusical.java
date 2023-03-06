/*
5)Desarrollar un programa en Java donde se puedan instanciar objetos de tipo DiscoMusical. 
Definir una clase llamada DiscoMusical considerando los siguientes atributos de clase:
·         titulo (String)
·         autor (String)
·         anioEdicion (int)
·         formato (String)
·         digital (boolean)
Definir un constructor y los métodos para poder establecer y obtener los valores de los atributos. 
Compilar el código para comprobar que no presenta errores. Crea un objeto y comprueba sus métodos. 
Para realizar el ejercicio deberá considerar aplicar el concepto de encapsulamiento, 
utilizar modificadores de acceso para los atributos y escribir el código de los getters y setters.
Ayuda: crear un método main para poder crear el objeto “disco1” e imprimir con él sus valores con System.out
utilizando el método toString.
 */
package discoMusical;

/**
 *
 * @author Amanda
 */
public class AppDiscoMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         DiscoMusical disco1 = new DiscoMusical("Baila", "Agapornis", 2016 , "CD", true);

	 System.out.println(disco1);
    }    
}
