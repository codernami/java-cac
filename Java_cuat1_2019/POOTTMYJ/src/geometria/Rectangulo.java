package geometria;

public class Rectangulo extends Figuras {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }
    
    @Override
    public int CalculoArea(){
        return (base * altura);
    }
    
}
