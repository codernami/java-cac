
//Clase 04/04 Jueves
package geometria;

public class AppFiguras {
    
    public static void main(String[] args) {
   
        Triangulo tri = new Triangulo(10,10);
        Cuadrado cua = new Cuadrado(12,12);
        Rectangulo rec = new Rectangulo(5,5);
         
        System.out.println("El área del triángulo es: " + tri.CalculoArea());
        System.out.println("El área del cuadrado es: " + cua.CalculoArea());
        System.out.println("El área del rectángulo es: " + rec.CalculoArea());    
    }
}
