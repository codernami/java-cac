/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos3;

/**
 *
 * @author Amanda
 */
public class Hilos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla PP = new Pantalla();
        PP.setVisible(true);
        PP.setTitle("Hilos en Java");
        PP.setLocationRelativeTo(null);
    }
    
}
//le damos un título a la ventana de formulario con setTitle.
//indicamos la posición de inicio en la que aparece la ventana de formulario en null(centrado).
