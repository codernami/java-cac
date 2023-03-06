/*
 10) La empresa informática “IPM Tech” necesita llevar un registro de todos sus empleados que se encuentran en la oficina central, 
para eso necesita implementar la clase Empleado que debe tener los siguientes atributos:
·         nombre: cadena (nombre y apellido)
·         cedula: cadena
·         edad : entero (entre 18 y 45 años)
·         casado: booleano
·         salario: numérico doble
 
Y los siguientes métodos:
·         Constructor con y sin parámetros de entrada.
·         Método que permita visualizar la clasificación según la edad del empleado de acuerdo al siguiente algoritmo:
o   Si edad es menor a 21, Junior
o   Si edad se encuentra entre 21 y 34, Intermedio
o   Si edad es mayor o igual a 35, Senior.
·         Imprimir los datos del empleado por pantalla (se puede utilizar salto de línea \n para separar los atributos.
·         Un método que permita aumentar el salario en un porcentaje que podrá ser pasado como parámetro al método.
·         Ayuda: crear un método main para poder crear el objeto “emp1” e imprimir con él sus valores con System.out.
 */
package IPMtech;

/**
 *
 * @author Amanda
 */
public class AppEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan","567.345",30,true,23400);
        emp1.Clasificacion();
        emp1.ImprimirEmpleado();
        emp1.AumentarSalario(2);
        //incremento en 1 es el doble de salario. en 2, es el triple y así
    }
    
}
