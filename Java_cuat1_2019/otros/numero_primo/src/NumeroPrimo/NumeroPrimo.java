/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroPrimo;

/**
 *
 * @author Amanda
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        System.out.println("Introduce un número entero positivo:  ");
        int n = Integer.parseInt(System.console().readLine());
        
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if ((n % 1) == 0){
            esPrimo = false;
        }
        }
        if(esPrimo){
            System.out.println("El " + n + " es primo.");
        }else{
            System.out.println("El " + n + "no es primo.");
        }
    }    
}
