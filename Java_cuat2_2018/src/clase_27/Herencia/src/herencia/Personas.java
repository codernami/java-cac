/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Amanda
 */
public class Personas {
//crear atributos de personas
    String apellido;
    String Nombre;
    int edad;
    
//método constructor
    public Personas(String apellido, String nombre, int edad){
        //System.out.println("Hola: " + nombre);
        
        //Paso 3 modifico el bloque de constructor, agrego
        //para que no me de null. para que no se pierda hago referencia a esta variable Nombre
        this.Nombre = nombre;
    }
        
        //Paso 2 modifico la sentencia system.out. lo paso a comentario y
        //agrego cartelito  
        
        public void cartelito(){
            System.out.println("Hola: "+ Nombre);
        }        
    }

