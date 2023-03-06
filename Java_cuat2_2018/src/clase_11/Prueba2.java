
//CLASE 11, 13/09/2018

package clase_11;

/**
 *
 * @author Amanda
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pantalla PP = new Pantalla();
       PP.setVisible(true);
      
       int importe1, importe2;
       importe1 = 1199;
       importe2 = 30;
       double resultado;
       resultado = importe1 / (float) importe2;
       
       System.out.println(resultado);
       
    }
    
}
/*Calcular una división y mostrar el resultado a través de un cuadro de dialogo. 
Y luego creo una clase para el cuadro de dialogo para asi llamarlo desde el main.
Uso de tipos de datos float, double. 
Ejercicios desde el main y lo muestro por consola
*/