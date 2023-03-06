package excepcionJuegoAleatorio;
/*ejercicio juego del drive. Martes 31/5/2019
crear una aplicación que juegue con el usuario a adivinar el número aleatorio 
entre 1 y 500. El usuario debe intentar adivinarlo. Para ello el usuario introduce
un número y la app indica el número ingresaado es mayor o menor al que debe adivinar.
Cuando consiga adivinarlo debe informarlo y mostrar en pantalla la cantidad de 
intentos empleados para adivinar el número. Si el usuario introduce algo diferente a
lo pedido se cuenta como un intento.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class aleatorio{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // debe ser entre 1 y 500, por lo que se incrementa en 1;
        int numeroAdivinar = (int) (Math.random() * 500);
        //inicializo mi variable
        int numero = 0;
        //contador de intentos
        int intentos = 0;
        
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un número (1-500)");
                try {
                    intentos++;
                    numero = teclado.nextInt();
                    System.out.println("El número introducido es: " + numero);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No ha introducido un número entero");
                    teclado.next(); // se lee el elemento no reconocido para
                                    // eliminarlo
                    leido = false;
                }
            } while (leido == false);
            
            if (numero > numeroAdivinar) {
                System.out.println("El número es menor. Sigue intentando");
            }
            if (numero < numeroAdivinar) {
                System.out.println("El número es mayor. Sigue intentándolo!");
            }
        } while (numero != numeroAdivinar);
        
        System.out.println("Felicitaciones! Has acertado, ya que el número es: " + numeroAdivinar);
        System.out.println("Cantidad de intentos: " + intentos);
    }
}
