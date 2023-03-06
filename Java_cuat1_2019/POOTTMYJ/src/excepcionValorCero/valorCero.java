
package excepcionValorCero;

import java.util.Scanner;

/* Ejercicio 1
Ingresar dos valores por teclado y realizar la operación de división.
En el caso que uno de los valores sea 0, mostrar un mensaje de error.
Ejercicio 2
Igual pero mostrar error para valores fuera de rango, números negativos.
Ejercicio 3
Igual pero mostrar error para ambos casos. sea 0 o fuera de rango.
*/

public class valorCero {
/*Ejercicio 1 _ Martes 31/6/2019
Ingresar dos valores por teclado y realizar la operación de división.
En el caso que uno de los valores sea 0, mostrar un mensaje de error.
*/
    
    public static void main(String[] args) {
       int valor1, valor2, cociente;
          
        Scanner tc1 = new Scanner(System.in);
        
        try{
        System.out.println("Ingrese un valor: ");
        valor1 = tc1.nextInt();    
        
        System.out.println("Ingrese otro valor: ");
        valor2 = tc1.nextInt();      
      
        cociente = valor1 / valor2;
        System.out.println("El resultado es: " + cociente);
        
        } catch (ArithmeticException e){ //para cero
            System.out.println("Ingresó un valor incorrecto");
        } finally {    
            System.out.println("Esto se ejecuta siempre");
        }
    }
}
