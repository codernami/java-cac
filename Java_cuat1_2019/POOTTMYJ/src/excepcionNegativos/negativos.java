
package excepcionNegativos;

import java.util.Scanner;

/* Ejercicio 2
Ingresar dos valores por teclado y realizar la operación de división.
En el caso que uno de los valores sean negativos, mostrar un mensaje de error.
*/
public class negativos {
    
    public static void main(String[] args) {
        int valor1, valor2, cociente;
          
        Scanner tc1 = new Scanner(System.in);
        
        try{
        System.out.println("Ingrese un valor: ");
        valor1 = tc1.nextInt();    
        
        System.out.println("Ingrese otro valor: ");
        valor2 = tc1.nextInt();      
        
        if( valor1 < 0 || valor2 < 0 ) { 
         throw new Exception("Ingresó un valor fuera de rango");
        }else 
            cociente = valor1 / valor2;
            System.out.println("El resultado es: " + cociente);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {    
            System.out.println("Esto se ejecuta siempre");
        }
    }
}

 