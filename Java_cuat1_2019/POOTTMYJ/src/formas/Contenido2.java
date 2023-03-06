
package formas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenido2 extends javax.swing.JFrame implements ActionListener{ 
   
   private JLabel nom, gen, leng;
   private JTextField txtNom;
   private JButton btnAceptar, btnLimpiar, btnSalir;
   private JComboBox comboGen;
   private JCheckBox opc1, opc2, opc3, opc4;
   String tit3 = " ";
   
    public Contenido2(){
        setLayout(null); 
        
        nom = new JLabel("Nombre: ");
        nom.setBounds(150,100,100,50);    
        add(nom);
        
        txtNom = new JTextField();
        txtNom.setBounds(220,110,200,30);
        add(txtNom);
       
        gen = new JLabel("Género: ");
        gen.setBounds(150,150,100,50);
        add(gen);
      
        comboGen = new JComboBox();
        comboGen.setBounds(220,160,100,30);
        comboGen.addItem("");        
        comboGen.addItem("Femenino");
        comboGen.addItem("Masculino");
        comboGen.addItem("Otros");      
        add(comboGen);
        
        leng = new JLabel("Lenguajes");
        leng.setBounds(150,250,100,50);
        add(leng);
        
        opc1 = new JCheckBox("Java");
        opc1.setBounds(220,260,100,30);        
        add(opc1);
       
        opc2 = new JCheckBox("Python");
        opc2.setBounds(220,300,100,30);        
        add(opc2);
        
        opc3 = new JCheckBox("Javascript");
        opc3.setBounds(220,340,100,30);        
        add(opc3);
        
        opc4 = new JCheckBox("PHP");
        opc4.setBounds(220,380,100,30);        
        add(opc4);
        
        //Botones 
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(125,500,90,30);
        add(btnAceptar);
        btnAceptar.addActionListener(this);
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(250,500,90,30);
        add(btnLimpiar);
        btnLimpiar.addActionListener(this);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(375,500,90,30);
        add(btnSalir);
        btnSalir.addActionListener(this);       
    }             
    @Override
    
    public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== btnAceptar){                       
            String tit1 = txtNom.getText();
            String tit2 = (String)comboGen.getSelectedItem();
               
            if(opc1.isSelected()){            
                tit3 = "Java -";
            }
            if(opc2.isSelected()){         
               tit3 = tit3 + "Python -";
            }
            if(opc3.isSelected()){                
               tit3 = tit3 + "Javascript -"; 
            }           
            if(opc4.isSelected()){                  
               tit3 =  tit3 + "PHP -";
            }            
            setTitle(tit1 + " " + tit2 + " " + tit3 );
        }else{     
            if (ae.getSource() == btnLimpiar){
                setTitle("");
                txtNom.setText("");
                
                opc1.setSelected(false);
                opc2.setSelected(false);                         
                opc3.setSelected(false);                                            
                opc4.setSelected(false);                                  
            }else{
              if (ae.getSource() == btnSalir){
                System.exit(0);
              }    
            }
        }
}
}