/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borrar;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Borrar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
        System.out.println("--------------------------------------- ");
        
        //ingreso por teclado
        int variable;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        variable = teclado.nextInt();
        System.out.println("Nro ingresado " + variable);
        System.out.println("--------------------------------------- ");
        
        
        //array
        String nombres[] = new String [10];
        nombres[0] = "Juan";
        nombres[1] = "Maria";
        nombres[2] = "Pablo";
        
        for (int i = 0; i < 10; i++) {
           System.out.println(nombres[i]);
        }
        System.out.println("--------------------------------------- ");
        
        
        //arrayList, importar java.util.ArrayList
        
        ArrayList<String> nombres2 = new ArrayList<String>();
        nombres2.add("Ana");
        nombres2.add("Luisa");
        nombres2.add("Felipe");
        nombres2.add("Verónica");
        nombres2.add("Juliana");
        nombres2.add("Federico");
        nombres2.add("Nicolás");
        nombres2.add("Martin");
        nombres2.add("Mariana");
        nombres2.add("Juan");
        System.out.println(nombres2); 
        System.out.println("--------------------------------------- ");
        
        //usando un for each
        for(String Listado:nombres2){
            System.out.println(Listado);
        }
        System.out.println("--------------------------------------- ");
        
//5)Crear un ArrayList y llenarlo con 10 números aleatorios. Luego buscar un número ingresado por teclado.        
        //arrayList y numeros aleatorios.buscar nro ingresado por teclado
        System.out.println("Ejercicio 5");
        ArrayList<Integer> numeros = new ArrayList<Integer>(9);
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(20)+1);
            //numeros.add ((int)(Math.random() * 20+ 1)); ? xq se repite al final
            System.out.println(numeros.get(i));
        }

        //la clase scanner importada y creada anteriormente
        int numTeclado;       
        System.out.println("Introduce un número: ");
        numTeclado = teclado.nextInt();
        
        for (int i = 0; i < numeros.size() ; i++) {            
            if (numTeclado == numeros.get(i)){
                 System.out.println("Nro ingresado por teclado - " + 
                         numTeclado + " - es igual al encontrado en el array de números - " + numeros.get(i)+ " -");          
            }else
            if (numTeclado != numeros.get(i)){    
                System.out.println("Número no encontrado en el array");
            }      
        }
        System.out.println("--------------------------------------- ");
        
//6)Almacene en un ArrayList nombres de personas. Utilice un método que al digitar una posición muestre el dato que contiene.
        System.out.println("Ejercicio 6");
        ArrayList<String> nombres3 = new ArrayList<String>();
        nombres3.add("Ana");
        nombres3.add("Luisa");
        nombres3.add("Felipe");
        nombres3.add("Verónica");
        nombres3.add("Juliana");
        nombres3.add("Federico");
        nombres3.add("Nicolás");
        nombres3.add("Martin");
        nombres3.add("Mariana");
        nombres3.add("Juan");
        
        int posicion;
        System.out.println("Ingrese número de posición entre 0 y 9");
        posicion = teclado.nextInt();
        
        System.out.println("La posición ingresada " + 
                         posicion + " contiene el nombre " + nombres3.get(posicion)+ " -");  
        System.out.println("--------------------------------------- ");
        
//7)Almacene en un ArrayList nombres de personas. Utilice un método que al digitar una posición elimine el dato que contiene.
        //uso el mismo array del punto anterior
        System.out.println("Ejercicio 7");
        int posicion2;
        System.out.println("Ingrese número de posición entre 0 y 9");
        posicion2 = teclado.nextInt();
        
        System.out.println("La posición ingresada " + 
                         posicion2 + " contiene el nombre " + nombres3.get(posicion2)+ " y será eliminado ");          
        nombres3.remove(posicion2);
        
        //vuelvo a listar para mostrar que se ha eliminado el elemento
        for(String Listado2: nombres3){
            System.out.println(Listado2);
        }
        System.out.println("--------------------------------------- ");
        
        
/*8)Dado un ArrayList con números, utilice un método que al digitar una posición 
reemplace el dato que contiene por uno ingresado por el usuario.*/
        System.out.println("Ejercicio 8");
        ArrayList<Integer> numeros2 = new ArrayList<Integer>(5);
        numeros2.add(3);
        numeros2.add(31);
        numeros2.add(300);
        numeros2.add(310);
        numeros2.add(320);
        
        int posicion3;
        System.out.println("Ingrese número de posición entre 0 y 4");
        posicion3 = teclado.nextInt();
        
        System.out.println("La posición ingresada " + 
                         posicion3 + " contiene el número " + numeros2.get(posicion3)+ " será cambiado por el número nuevo 1000 ");          
        numeros2.set(posicion3,1000);
        
        //vuelvo a listar para mostrar que se ha eliminado el elemento
        for(int Listado3: numeros2){
            System.out.println(Listado3);
        }
        System.out.println("--------------------------------------- ");
        

/*9)Dado un ArrayList con números, desarrolle un método que muestre por pantalla el número mayor 
y otro método que muestre el menor de la lista. Utilice un Iterador para recorrer el ArrayList.*/
//uso el mismo array de números del punto anterior, numeros2

        System.out.println("Ejercicio 9");
        int mayor = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;
        
        Iterator<Integer> it = numeros2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            
        }
        for (int i = 0; i < numeros2.size(); i++) { 
            
            mayor = Integer.max(mayor, numeros2.get(i));
            menor = Integer.min(menor, numeros2.get(i));
            System.out.println("nro" + mayor);
        }
         System.out.println("--------------------------------------- ");


//10) Utilizar un Iterador para calcular el promedio de un conjunto de valores almacenados en un ArrayList.
        System.out.println("Ejercicio 10");
        int suma=0;
        float promedio = 0;
        
        Iterator<Integer> it2 = numeros2.iterator();
        while (it2.hasNext()){
            suma = suma + (Integer)it2.next();           
        }
        System.out.println("suma es: " + suma);
        promedio = (float)suma / numeros2.size();
        System.out.println("El promedio es de " + promedio);
        
        System.out.println("--------------------------------------- ");

    }      
}


/*



*/