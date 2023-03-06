/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        Personas PP = new Personas("Gomez","Ariel",25);
        
        /*Paso 2 lo cambio porque el atributo apellido es público
        PP.apellido ="Fernandez";
        System.out.println("Nuevo apellido: " + PP.apellido);*/
        
        /*Paso 3 puedo cambiar los valores. crear el objeto sin valor y
        dar los valores "parámetros" después
        paso todo a comentario menos la línea Personas PP = new Personas("Gomez","Ariel",25);*/
        
        Abogados AA = new Abogados("Perez", "Juan",45,".234/56","civil");
        PP.cartelito();//sale null lo corrijo en personas
        AA.cartelito(); //hereda cartelito de personas
    }
    
}
