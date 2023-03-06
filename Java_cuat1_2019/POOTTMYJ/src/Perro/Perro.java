/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perro;

/**
 *
 * @author Amanda
 */

public class Perro{
	String nombre;
	String raza;
	double altura;

//constructor
    public Perro(){
    }

    public Perro(String nombre, String raza, double altura){
            this.nombre = nombre;
            this.raza = raza;
            this.altura = altura;
    }

//getters y setters

    public String getNombre(){
            return nombre;
    }
    public void setNombre(String nombre){
            this.nombre = nombre;
    }	


    public String getRaza(){
            return raza;
    }
    public void setRaza(String raza){
            this.raza = raza;
    }	

    public double getAltura(){
            return altura;
    }
    public void setAltura(double altura){
            this.altura = altura;
    }	

    //método toString

    @Override
    public String toString(){
        String mensaje = "El perro se llama "+ nombre +" y su raza es: " + raza + ". Mide " + altura + " cm";
        return mensaje;
    }
    
    public String Ladrar(){
        return "El perro ladra.";
    }
    public String Caminar(){
        return "El perro camina.";
    }
    public String Saltar(){
        return "El perro salta.";
    }
    public String Recobrar(){
        return "El perro recupera el aliento.";
    }
}
