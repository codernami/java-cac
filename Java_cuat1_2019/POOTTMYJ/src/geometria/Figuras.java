
package geometria;

public abstract class Figuras {
    protected int base, altura;
    
    public Figuras(){        
    }

    public Figuras(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public abstract int CalculoArea();
    
}
