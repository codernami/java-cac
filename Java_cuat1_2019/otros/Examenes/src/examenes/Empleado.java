
package examenes;

/**
 *
 * @author Amanda
 */

public class Empleado{
	String nombre;
	String cedula;
	int edad;
	boolean casado;
	double salario;

public Empleado(){
}

public Empleado(String nombre, String cedula, int edad, boolean casado, double salario){
	this.nombre = nombre;
	this.cedula = cedula;
	this.edad = edad;
	this.casado = casado;
	this.salario = salario;

}

public String Clasificacion() {
	String c = " ";
	if (edad < 21){
	 c = "Junior";
	}
	if ((edad > 20)|(edad < 35)){
	 c = "Intermedio";
	}
	if (edad >= 35){
	 c = "Senior";
	}
	return c;
}


public void ImprimirEmpleado(){
	System.out.println(this.nombre);
	System.out.println(this.cedula);
	System.out.println(this.edad);
	
	if(casado) {
	System.out.println("casado");
	}
	else{
	System.out.println("soltero");
	}
	System.out.println(this.salario);
	}

public void AumentarSalario(double incremento){
	salario = salario * (1 + incremento);
}

}

