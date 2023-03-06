
package excepcionThrowNew;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Excepciones ejercicio nº 2. Martes 4/6/2019 

Crear un programa que genere un número aleatorio e indique si dicho número es par o impar.
El programa utiliza el método random() de la clase math para generar un número aleatorio 
entre 0 y 999, a continuación se lanza una excepción con el correspondiente mensaje, 
El manejador de la excepción se limitará a mostrar el mensaje asociado a la excepción
capturada.*/

public class throwNew{
    
    public static void main(String[] args) {
    
        try{
        int numero = (int) (Math.random() * 999)+ 1;
      
        if (numero %2 == 0) { 
            throw new Exception(numero +" > Es un número par");
        } else{
            throw new Exception(numero + " > Es un número impar");
        }
        } catch(Exception e){
          System.out.println(e.getMessage());
        }   
}
}

   
 