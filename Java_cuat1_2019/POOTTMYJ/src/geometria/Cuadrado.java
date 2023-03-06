package geometria;

public class Cuadrado extends Figuras{

    public Cuadrado(int base, int altura) {
        super(base, altura);
    }
    @Override
    public int CalculoArea(){
        return base;
    }
}
