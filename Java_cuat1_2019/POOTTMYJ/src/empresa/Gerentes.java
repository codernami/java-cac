package empresa;

public class Gerentes extends Persona{
    
    public Gerentes(String nombre, String apellido, int dni, int fnac, int fIngreso, int categoria) {
        super(nombre, apellido, dni, fnac, fIngreso, categoria);
    }
    
    @Override    
    public String toString(){    
    return super.toString() + " Es gerente";
    }
}
