
package empresa;


public class Operarios extends Persona{
    public Operarios(String nombre, String apellido, int dni, int fnac, int fIngreso, int categoria) {
        super(nombre, apellido, dni, fnac, fIngreso, categoria);
    }
    
    @Override
    public String toString(){
        return super.toString() + " Es operario";
    }
}


