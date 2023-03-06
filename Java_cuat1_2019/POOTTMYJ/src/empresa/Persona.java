package empresa;

public class Persona {
    protected String nombre, apellido;
    protected int dni, fnac, fIngreso,categoria;
    //protected int dia,mes,anio;

    public Persona(){    
    } 

    public Persona(String nombre, String apellido, int dni, int fnac, int fIngreso, int categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fnac = fnac;
        this.fIngreso = fIngreso;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFnac() {
        return fnac;
    }

    public void setFnac(int fnac) {
        this.fnac = fnac;
    }

    public int getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(int fIngreso) {
        this.fIngreso = fIngreso;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

@Override
    public String toString(){
    return "Nombre: " + nombre + " Apellido:" + apellido;
    }
}

