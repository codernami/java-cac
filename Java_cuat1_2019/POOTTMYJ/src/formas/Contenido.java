
package formas;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contenido extends javax.swing.JFrame implements ActionListener{
    
    private JLabel eti1, eti2, eti3;
    private JTextField texto1;
    private JButton boton1, boton2;   
    
    public Contenido(){
        //limpio 
        setLayout(null); 
        
        //Formato de fuente
        Font fuente = new Font("Calibri", Font.BOLD, 16);
        
        // x,y,ancho,alto ubicación y tamaño
        //Etiquetas label
        eti1 = new JLabel("Bienvenidos!!!");
        eti1.setBounds(250,100,100,50);
        eti1.setFont(fuente);
        add(eti1);
    
        eti2 = new JLabel("Al curso de Java");
        eti2.setBounds(400,100,100,50);
        add(eti2);
    
        eti3 = new JLabel("Nombre: ");
        eti3.setBounds(190,185,150,50);
        add(eti3);
    
        //Cuadro de texto
        texto1 = new JTextField();
        texto1.setBounds(250,200,300,30);
        add(texto1);
    
        //Botones
        boton1 = new JButton("Aceptar");
        boton1.setBounds(250,300,90,30);
        add(boton1);
        boton1.addActionListener(this);
    
        boton2= new JButton("Salir");
        boton2.setBounds(400,300,90,30);
        add(boton2);
        boton2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== boton1){
            setTitle(texto1.getText());
        }else{
              if (ae.getSource() == boton2){
                System.exit(0);
              }
            }    
        }  
}