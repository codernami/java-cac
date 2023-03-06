
package colores;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenido extends javax.swing.JFrame implements ActionListener{
    
    private JLabel lblColor;
    private JComboBox lista1;
    private JButton btn1;
        
    public Contenido(){   
        setLayout(null); 
   
        //Label Colores
        lblColor = new JLabel("Colores");
        lblColor.setBounds(150,110,100,50);
        add(lblColor);
        
        //ComboBox
        lista1 = new JComboBox();
        lista1.setBounds(200,120,100,30);        
        lista1.addItem("Rojo");
        lista1.addItem("Verde");
        lista1.addItem("Azul");
        add(lista1);
        
        //Aceptar
        btn1 = new JButton("Aceptar");
        btn1.setBounds(200,200,90,30);
        add(btn1);  
        btn1.addActionListener(this);
    }
    
    @Override
    /*Evento al hacer click en Aceptar: cambia el color del botón según el color 
    seleccionado en la lista desplegable y agrega el color (en letras) en la barra de titulo. */
    public void actionPerformed(ActionEvent ae){
       
        if (ae.getSource()== btn1){ 
            //obtengo el item seleccionado para colocarlo en la barra de título  
            String seleccionado = (String)lista1.getSelectedItem();
            setTitle((String)seleccionado);
            
            //creo los colores 
            Color colorRojo = new Color(255,0,0);
            Color colorVerde = new Color(0,255,0);
            Color colorAzul = new Color(0,0,255);
            
            //el botón cambia de color según lo seleccionado
            if(seleccionado.equals("Rojo")){               
               btn1.setBackground(colorRojo);
            }else{
                if(seleccionado.equals("Verde")){                
                   btn1.setBackground(colorVerde);
                }else{
                      if(seleccionado.equals("Azul")){
                         btn1.setBackground(colorAzul);
                      }
                   }             
         //   int rojo = Integer.parseInt(seleccionado); ???
         //   int verde = Integer.parseInt(seleccionado); 
         //   int azul = Integer.parseInt(seleccionado);    
         //   Color colorF = new Color(rojo,verde,azul);
         //   btn1.setBackground(ColorF);            
            }
        }     
    }
}           


/* otras opciones

*** usando Color ***
if("Rojo".equals(seleccionado)){
    btn1.setBackground(Color.red);
}else{               
    if("Verde".equals(seleccionado)){                
       btn1.setBackground(Color.green);
}else{
      if("Azul".equals(seleccionado)){
        btn1.setBackground(Color.blue);
      }
}...
*/  

/* usando variables y definiendo el color por item
if("Rojo".equals(seleccionado)){            
    int rojo = 255;  
    int verde = 0;
    int azul = 0;           
                
    Color colorF = new Color(rojo,verde,azul);
    btn1.setBackground(colorF);              
}else{    
      if("Verde".equals(seleccionado)){
        int rojo = 0;
        int verde = 255;
        int azul = 0;
                    
        Color colorF = new Color(rojo,verde,azul);
        btn1.setBackground(colorF);              
      }else{
            if("Azul".equals(seleccionado)){
                int rojo = 0;
                int verde = 0;
                int azul = 255;
                
                Color colorF = new Color(rojo,verde,azul);
                btn1.setBackground(colorF);
            }
     }...
          
*/