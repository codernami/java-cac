/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author alumno
 */
public class AppCerosUnos {

    /**
     * @param args the command line arguments
     */
    
   /*
    Ejercicio 2: generar 1000 números ceros y 1000 números 1 usando hilos.
    */ 
    public static void main(String[] args) {
      CerosConHilos h1 = new CerosConHilos();
      h1.start();
      UnosConHilos h2 = new UnosConHilos();
      h2.start();
    }
    
}
