
package formas;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contenido3 extends javax.swing.JFrame implements ActionListener{
    protected JLabel eti1,eti2;
    protected JTextField texto1;
    protected JButton boton;
    protected ButtonGroup bg;
    protected JRadioButton radio1, radio2, radio3, radio4, radio5;
    String tit1;
    String tit3=" ";    
   
 public Contenido3(){

        setLayout(null);

        eti1 = new JLabel("Nombre: ");
        eti1.setBounds(150,100,100,50);    
        add(eti1);
        
        eti2 = new JLabel("Estado civil: ");
        eti2.setBounds(150,160,100,50);
        add(eti2);
        
        texto1 = new JTextField();
        texto1.setBounds(220,110,200,30);
        add(texto1);
          
        bg = new ButtonGroup();
        
        radio1 = new JRadioButton("Soltero");
        radio1.setBounds(250,170,90,30);
        bg.add(radio1);
        add(radio1);

        radio2 = new JRadioButton("Casado");
        radio2.setBounds(250,220,90,30);
        bg.add(radio2);
        add(radio2);
        
        radio3 = new JRadioButton("Separado");
        radio3.setBounds(250,270,90,30);
        add(radio3);
        bg.add(radio3);
        
        radio4 = new JRadioButton("Unión civil");
        radio4.setBounds(250,320,90,30);
        add(radio4);
        bg.add(radio4);
        
        radio5 = new JRadioButton("Viudo");
        radio5.setBounds(250,370,90,30);
        add(radio5);
        bg.add(radio5);
       
        boton = new JButton("Aceptar");
        boton.setBounds(350,450,90,30);
        add(boton);
        boton.addActionListener(this);        
} 
 
@Override
 public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== boton){                       
            String tit1 = texto1.getText();
              
            if(radio1.isSelected()){            
               tit3 = (tit3 + "Soltero - ");
            }
            if(radio2.isSelected()){         
               tit3 = tit3 + "Casado - ";
            }
            if(radio3.isSelected()){                
               tit3 = tit3 + "Separado - "; 
            }           
            if(radio4.isSelected()){                
               tit3 = tit3 + "Unión civil - "; 
            }
            if(radio5.isSelected()){                  
               tit3 = tit3 + "Viudo - ";
            }
            setTitle(tit1 + " " + tit3);
        }
        }    
}