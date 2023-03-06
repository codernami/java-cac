package javaapplication39;


import java.util.Scanner;

public class JavaApplication39{
    
    public static void main(String []args){

        System.out.println("Introduzac la primera palabra: ");
        Scanner entradaEscaner = new Scanner(System.in);

        String entradaTeclado01;
        entradaTeclado01 = entradaEscaner.nextLine();
        System.out.println("Introduzca la segunda palabra: ");
        String entradaTeclado02;
        entradaTeclado02 = entradaEscaner.nextLine();
        int comparador01 = entradaTeclado01.length(); 


        if(entradaTeclado01.length()>entradaTeclado02.length()){ //Comparamos cuál de las dos entradas tiene menos carácteres
            comparador01 = entradaTeclado02.length(); //Establecemos el comparador a la entrada que tiene menos carácteres
        }
        int comparador02 = entradaTeclado01.length();
        if(entradaTeclado01.length()<entradaTeclado02.length()){ //Comparamos cuál de las dos entradas tiene más carácteres
            comparador02 = entradaTeclado02.length(); //Establecemos el comparador a la entrada que tiene más carácteres
        }
        comparador02 -= comparador01; //Calculamos la diferencia del comparador que tiene más valor menos el que tiene menos, para así saber cuantas veces tenemos que repetir la frase "La palabra no tiene esta letra"
        for(int i=0;i<comparador01;i++){
        System.out.println("¿La letra: "+(i+1)+" igual en las dos palabras?: "+entradaTeclado01.substring(i,i+1).equals(entradaTeclado02.substring(i,i+1)));
        }
        String palabraCorta = entradaTeclado01;
        if(entradaTeclado01.length() > entradaTeclado02.length()){
            palabraCorta = entradaTeclado02;
        }
        for(int j=0;j<comparador02;j++){
            System.out.println("La palabra: \""+palabraCorta+"\" no tiene letra: "+(j+comparador01+1));
        }
    } //Cierre del main
 
}

