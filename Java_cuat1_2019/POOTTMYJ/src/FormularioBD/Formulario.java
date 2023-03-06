/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioBD;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author Amanda
 */

public class Formulario extends javax.swing.JFrame implements ActionListener{
    
    JLabel titu1;    
    JLabel nro,nom,ape,edad,gen;
    JTextField nrotxt,nomtxt,apetxt,edadtxt ;
    JButton btnAceptar,btnLimpiar, btnSalir;
    JComboBox comboGen;
    JFrame jf ;
    
    public Formulario(){
        //limpio 
        setLayout(null);    
        
        Font fuenteTitu = new Font("Calibri", Font.BOLD,30);
        
        //TITULO
        titu1= new JLabel("Alta de Usuarios");
        titu1.setBounds(300,50,300,50);
        titu1.setFont(fuenteTitu);
        add(titu1);
    
        //NRO SOCIO
        nro = new JLabel("Nro de socio: ");
        nro.setBounds(190,150,150,50);
        add(nro);
    
        nrotxt = new JTextField(20);
        nrotxt.setBounds(270,160,80,30);
        add(nrotxt);
        
        //NOMBRE
        nom = new JLabel("Nombre: ");
        nom.setBounds(190,200,150,50);
        add(nom);
    
        nomtxt = new JTextField(20);
        nomtxt.setBounds(270,210,300,30);
        add(nomtxt);
        
        //APELLIDO
        ape = new JLabel("Apellido: ");
        ape.setBounds(190,250,150,50);
        add(ape);
        
        apetxt = new JTextField(100);
        apetxt.setBounds(270,260,300,30);
        add(apetxt);
        
       //EDAD
        edad = new JLabel("Edad: ");
        edad.setBounds(190,300,150,50);
        add(edad);
        
        edadtxt = new JTextField(20);
        edadtxt.setBounds(270,310,300,30);
        add(edadtxt);
        
       //GENERO
        gen = new JLabel("Género: ");
        gen.setBounds(190,350,100,50);
        add(gen);
      
        comboGen = new JComboBox();
        comboGen.setBounds(270,350,100,30);
        comboGen.addItem("");        
        comboGen.addItem("Femenino");
        comboGen.addItem("Masculino");
        comboGen.addItem("Otro");      
        add(comboGen);
    
        //Botones
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(190,500,100,40);
        add(btnAceptar);
        btnAceptar.addActionListener(this);
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(330,500,100,40);
        add(btnLimpiar);
        btnLimpiar.addActionListener(this);
        
    
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(470,500,100,40);
        add(btnSalir);
        btnSalir.addActionListener(this);
   
   
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()== btnAceptar){
        
            
        try {
        String DriverBD = "com.mysql.jdbc.Driver";
        String Servidor ="//localhost:3307/";
        String Base = "Club";
        String usuario = "root";
        String clave = "admin";
        String TipoCn = "jdbc:mysql:";
        
            Class.forName(DriverBD);
            Connection cn;
            cn = (Connection) DriverManager.getConnection(TipoCn + Servidor +Base ,usuario, clave); 
            
            PreparedStatement ps;
            System.out.println("Conexión exitosa");
            
            //ps = cn.prepareStatement("insert into provincias(nombre) values ('San Luis')");
            String Nombre= this.nomtxt.getText();
            ps = cn.prepareStatement("insert into socios(nombre)values('"+ Nombre +"')");
            System.out.println("insert into socios(nombre)values('"+ Nombre +"')");
            
            
            ps.execute();
            cn.close();
            System.out.println("Dato guardado exitosamente");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error de conexión");
            
        } catch (SQLException ex) {
            System.out.println("Error de SQL"+ ex);
            
        }
        
        }else{
              if (ae.getSource() == btnLimpiar){
                  nrotxt.setText(" ");
                  nomtxt.setText(" ");
                  apetxt.setText(" ");
                  edadtxt.setText(" ");
                  comboGen.addItem(" ");
              }else{
                    if (ae.getSource() == btnSalir){
                        System.exit(0);
                    }
              }            
            }
}
}
  

