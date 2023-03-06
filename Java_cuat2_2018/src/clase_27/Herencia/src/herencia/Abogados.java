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
public class Abogados extends Personas{
    //Atributos: tiene 5 sumando los 3 de personas. Esta es una subclase.
    String Matricula;
    String Especialidad;
    
    //creo el constructor
    public Abogados(String apellido, String nombre, int edad, String matricula,String especialidad){
        //definir que variables vienen de la clase superior que vengo heredando
        super(apellido,nombre,edad);
        
        //llamo desde esta clase donde las cree primero(arriba) llama a las del parametro(al
        //estar en minusculas es otro nombre ojo!
        this.Especialidad = especialidad;
        this.Matricula= matricula;
    }
    
    //cartelito de abogados diferente. Sobrescribo el cartelito de Personas
    public void cartelito(){
        System.out.println("Hola: "+ this.Especialidad);
    }
    
    //es conveniente heredar de la anterior y no siempre de la principal
    
}
