
package formas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenido1 extends javax.swing.JFrame implements ActionListener{ 
    private JLabel nom, gen;
    private JTextField txtNom;
    private JButton btnAceptar;
    private JComboBox comboGen;
    
    public Contenido1(){
        //limpio 
        setLayout(null); 
        
        //Nombre
        nom = new JLabel("Nombre: ");
        nom.setBounds(150,100,100,50);    
        add(nom);
              
        txtNom = new JTextField();
        txtNom.setBounds(215,110,300,30);
        add(txtNom);
       
        //Género
        gen = new JLabel("Género: ");
        gen.setBounds(150,190,100,50);
        add(gen);
        
        //lista
        comboGen = new JComboBox();
        comboGen.setBounds(215,190,100,30);        
        comboGen.addItem("Femenino");
        comboGen.addItem("Masculino");
        comboGen.addItem("Otros");      
        add(comboGen);
       
        //Botón
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(400,300,90,30);
        add(btnAceptar);
        btnAceptar.addActionListener(this);
    }    
         
    @Override
    public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== btnAceptar){
            setTitle(txtNom.getText() + "  " + (String)comboGen .getSelectedItem());           
        } 
    }
}

/*puedo usar variables para hacer lo mismo.Para que sea más fácil de encontrar en caso de error.
    if(ae.getSource()==btnAceptar){
        String titulo = txtNom.getText() + " " + (String)comboGen .getSelectedItem();
        setTitle(titulo);
    }
*/  
    
/* o también usando 2 variables
    if(ae.getSource() == btnAceptar){
        String titulo = txtNom.getText();
        String titulo1 = (String)comboGen .getSelectedItem();
        setTitle(titulo + " " + titulo1);
    }
*/
