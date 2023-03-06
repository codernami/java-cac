package geometria;

public class Triangulo extends Figuras {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }    
    
    @Override   
    public int CalculoArea(){
        return ((base * altura) / 2);
    }
}
