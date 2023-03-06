
//Clase 11/04 jueves 

package formas;

public class AppFormulario {

    public static void main(String[] args) {

        /*clase contenido donde muestro en la barra de titulo:
        el nombre ingresado. */
        Contenido form = new Contenido();
        form.setBounds(0,0,700,550);
        form.setVisible(false);
       
        /*clase Contenido1 donde muestro en la barra de titulo:
        nombre ingresado + género seleccionado en combobox*/   
        Contenido1 form1 = new Contenido1();
        form1.setBounds(0,0,750,400);
        form1.setVisible(false);
       
        /*clase Contenido2 donde muestro en la barra de titulo:
        nombre ingresado + género + lenguaje de programación seleccionado en checkbox*/    
        Contenido2 form2 = new Contenido2();
        form2.setBounds(250,90,650,600);
        form2.setVisible(false);
        
        /*Clase Contenido3 donde muestro en la barra de título:
        nombre ingresado + opción seleccionada de estado civil. JRadioButton
        */
        Contenido3 form3 = new Contenido3();
        form3.setBounds(250,90,650,600);
        form3.setVisible(true);
    }   
    
}
/*para no borrar todo solo hago visible el formulario de la clase con la que estoy trabajando
usando setVisible en true para ver el formulario sino lo pongo en false para no verlo*/