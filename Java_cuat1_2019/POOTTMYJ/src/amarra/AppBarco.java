
//Clase 19/04 al 26/04 M J M
package amarra;

import java.util.Scanner;

public class AppBarco {

    public static void main(String[] args) {
        int matricula, eslora, aFab;
        int mastiles, potencia, camarotes;
        String nombre;
        int dni, fInicial, fFinal, ubicacion;
               
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese matrícula de barco: ");
        matricula = teclado.nextInt();
        
        System.out.println("Ingrese metros de eslora: ");
        eslora = teclado.nextInt();
        
        System.out.println("Ingrese año de fabricación: ");
        aFab = teclado.nextInt();
        
        System.out.println("Ingrese cantidad de mastiles: ");
        mastiles = teclado.nextInt();
        
        System.out.println("Ingrese potencia del barco: ");
        potencia = teclado.nextInt();
        
        System.out.println("Ingrese cantidad de camarotes: ");
        camarotes = teclado.nextInt();
        
        System.out.println("Ingrese nombre de cliente: ");
        nombre = teclado.next();
        
        System.out.println("Ingrese DNI: ");
        dni = teclado.nextInt();
        
        System.out.println("Ingrese fecha inicial: ");
        fInicial = teclado.nextInt();
        
        System.out.println("Ingrese fecha final: ");
        fFinal = teclado.nextInt();
       
        System.out.println("Ingrese posiciòn de amarra: ");
        ubicacion = teclado.nextInt();
                
        Barco bar = new Barco(matricula, eslora, aFab);
        TipoBarco tipo = new TipoBarco (matricula, eslora, aFab, mastiles, potencia, camarotes);
        Alquiler alq = new Alquiler (matricula, eslora, aFab, nombre, dni, fInicial, fFinal, ubicacion);
        
        System.out.println("Cálculo del método: " + bar.CalculoModulo());
        System.out.println("Tipo de barco: " + tipo.Mostrar());
        System.out.println("Alquiler: " + alq.DiasOcupados());
        
        System.out.println("Total a pagar: " + (alq.DiasOcupados()+ tipo.Mostrar()));
    }
    
}
  


