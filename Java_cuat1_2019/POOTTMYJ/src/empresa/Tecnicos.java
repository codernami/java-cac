package empresa;

public class Tecnicos extends Operarios{

    public Tecnicos(String nombre, String apellido, int dni, int fnac, int fIngreso, int categoria) {
        super(nombre, apellido, dni, fnac, fIngreso, categoria);
    }
    
    @Override
     public String toString(){
        return super.toString() + " Categoría Técnico";
    }
}
