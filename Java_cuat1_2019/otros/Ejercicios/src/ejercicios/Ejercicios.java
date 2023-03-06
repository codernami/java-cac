/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

/*Llenar un vector de 5 posiciones con números enteros. Los valores se deberán ingresar por teclado. 
Mostrar la cantidad de números positivos y la sumatoria de los valores almacenados en el vector.*/
    int numeros[]  = new int [5];
    int suma = 0;
    int sumaNeg = 0;
    int total = 0;
    int cont = 0;
    
    Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {                    
             System.out.println("Ingrese un número");
             numeros[i] = teclado.nextInt();        
        }
        System.out.println("--------------------------------------------");
        for (int i = 0; i < 5; i++) {
            if(numeros[i]>0){
                suma += numeros[i];
                cont++;
            }else{
                if(numeros[i]<0){
                    sumaNeg += numeros[i];
                }
            }       
        }
        total = suma + sumaNeg;
        System.out.println("Cantidad de números positivos "+ cont);
        System.out.println("La suma total es de " + total);
        
        System.out.println("--------------------------------------------");
        
        
//Cree una matriz de 3x5, cárguela con números aleatorios entre 0 y 100 y muéstrela por pantalla.
        System.out.println("Ejercicio 2");
        
        int num[][] = new int[3][5];
        
        for (int i = 0; i < num.length; i++) { 
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int)(Math.random()* 99 + 1);
                System.out.println(num[i][j]+ "\t");               
            }
            System.out.println();
        }                                        
   }
}
