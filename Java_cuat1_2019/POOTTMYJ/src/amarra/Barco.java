
package amarra;

public class Barco {
    
    protected int matricula;
    protected int eslora;
    protected int aFab;
    
    public Barco(){
    }
    
    public Barco(int matricula, int eslo, int aFab){
    this.matricula = matricula;
    eslora = eslo;
    this.aFab = aFab;       
    }
    
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
      this.matricula = matricula;  
    }
    
    public int getEslora(){
        return eslora;
    }
    public void setEslora(int eslora){
      this.eslora = eslora;  
    }
    
    public int aFab(){
        return aFab;
    }
    public void setAfab(int aFab){
      this.aFab = aFab;  
    }
    
    public int CalculoModulo(){
    return eslora * 10;
    }
    
}
