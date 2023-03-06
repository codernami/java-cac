package amarra;

public class TipoBarco extends Barco {
    private int mastiles, potencia, camarotes;
    private final float velero = 5000;
    private final float deportivo = 7000;
    private final float yate = 12000;
   
    
    public TipoBarco(int matricula, int eslora, int aFab, int mastiles, int potencia, int camarotes){
        super(matricula, eslora, aFab);
        this.mastiles = mastiles;
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    
    public int getMastiles(){
        return mastiles;
    }
    public void setMastiles(int mastiles){
        this.mastiles = mastiles;
    }
    
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getCamarotes(){
        return camarotes;
    }
    public void setCamarotes(int camarotes){
        this.camarotes = camarotes;
    }
    
    public float Mostrar(){
        if (mastiles != 0){
            return velero;
        }else{
            if (camarotes == 0){
                return deportivo;
            }else{
                return yate;
            }
        }
    }
}
    



