
package amarra;

public class Alquiler extends Barco {
    private String nombre;
    private int dni;
    private int fInicial;
    private int fFinal;
    private int ubicacion;
    
    private int calculoDias;
    
    public Alquiler(int matricula, int eslora, int aFab, String nombre, int dni, int fInicial, int fFinal, int ubicacion){
        super(matricula, eslora, aFab);

        this.nombre = nombre;
        this.dni = dni;
        this.fInicial = fInicial;
        this.fFinal = fFinal;
        this.ubicacion = ubicacion;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public int getFinicial(){
        return fInicial;
    }
    public void setFinicial(int fInicial){
        this.fInicial = fInicial;
    }
    
    public int getFinal(){
        return fFinal;
    }
    public void setFinal(int fFinal){
        this.fFinal = fFinal;
    }
    
    public int getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(int ubicacion){
        this.ubicacion = ubicacion;
    }

    //calculo los dias de ocupacion
    public int DiasOcupados(){
        calculoDias = (fFinal - fInicial + 1) * super.CalculoModulo();
        return calculoDias;
    }    
}


