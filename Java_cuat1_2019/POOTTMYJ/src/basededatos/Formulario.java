
package basededatos;

public class Formulario {
    public static void main(String[] args) {
        Datos form = new Datos();
        form.setBounds(0,0,560,750);
        form.setVisible(true);
        
        // con el bloque de dirección a la derecha de estado civil
        OtroDatos form1 = new OtroDatos();
        form1.setBounds(0,0,900,650);
        form1.setVisible(false);
}
}
