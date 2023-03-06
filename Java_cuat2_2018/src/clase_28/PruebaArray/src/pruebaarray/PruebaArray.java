
package pruebaarray;

import java.util.ArrayList;
import java.util.List;

public class PruebaArray {

    public static void main(String[] args) {
        /*Paso 1 en clase
        //defino lista de arrays
        String[] MiArray = new String[20];
        MiArray[1] = "Juan";
        MiArray[2] = "Pedro";
        
        for (int i = 0; i < 20; i++) {
            System.out.println(MiArray[i]);
        }//los valores null son los que no contienen un dato*/
        
        
        //Paso 2 en clase
        /*
        Integer numero = 18;
        
        //creo un array dinámico
        ArrayList<Integer> listado = new ArrayList <Integer>();
        listado.add(numero);
        listado.add(35);
        listado.add(83);
        listado.add(-8);
        listado.add(36);
        
        System.out.println("Cantidad: " + listado.size());
        System.out.println("La posición 3 es: " + listado.get(2));
        
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i));
            
        }*/
        
        //Paso 3 en clase
        String nombre = "Juan";
        List<String> colores = new ArrayList <String>();
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("rojo");
        colores.add("blanco");
        
        System.out.println("Cantidad: " + colores.size());
        
        //for each = for extendido
        for(String listado:colores){
        System.out.println(listado);
        }
    }
    
}


