/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author Amanda
 */
class Empleado extends Persona { 
private int legajo; 

public Empleado(String n, int leg) { 
super(n); 
this.legajo = leg; 
} 
@Override
public void hablar () { 
System.out.println("Mi legajo es " + this.legajo + " y me llamo " + this.nombre); 
}
}
