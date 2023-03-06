/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPMtech;

/**
 *
 * @author Amanda
 */
public class Empleado {
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
            System.out.println(c);
	}
	if ((edad > 20) | (edad < 35)){
	 c = "Intermedio";
            System.out.println(c);
	}
	if (edad >= 35){
	 c = "Senior";
            System.out.println(c);
	}
	return c;
}

public void ImprimirEmpleado(){
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Cedula: " + this.cedula);
	System.out.println("Edad: " + this.edad);
	
	if(casado) {
	System.out.println("casado");
	}
	else{
	System.out.println("soltero");
	}
	System.out.println("Salario: " + this.salario);
	}

public void AumentarSalario(double incremento){
	salario = salario * (1 + incremento);
        System.out.println("Aumento de salario: " + salario);
}

}

