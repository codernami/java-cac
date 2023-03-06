
package prueba;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Form extends javax.swing.JFrame implements ActionListener{
    
    JLabel titu1,titu2;    
    JLabel nomL, apeL,mailL,telL,comL,sedeL,curL;
    JTextField nomT, apeT,mailT,telT,comT,sedeT,curT;
    JButton btnAceptar, btnSalir;
    JFrame jf ;
    
    public Form(){
        //limpio 
        setLayout(null);    
        
        Font fuenteTitu = new Font("Calibri", Font.BOLD,30);
        
        //JPanel pane = new JPanel(layout); 
        
        
        //TITULO
        titu1 = new JLabel("Registro de estudiantes");
        titu1.setBounds(230,50,300,50);
        titu1.setFont(fuenteTitu);
        add(titu1);
    
        //NOMBRE
        nomL = new JLabel("Nombre/s: ");
        nomL.setBounds(190,150,150,50);
        add(nomL);
    
        nomT = new JTextField(20);
        nomT.setBounds(250,160,300,30);
        add(nomT);
        
        //APELLIDO
        apeL = new JLabel("Apellido/s: ");
        apeL.setBounds(190,200,150,50);
        add(apeL);
    
        apeT = new JTextField(20);
        apeT.setBounds(250,210,300,30);
        add(apeT);
        
        //MAIL
        mailL = new JLabel("Mail: ");
        mailL.setBounds(190,250,150,50);
        add(mailL);
        
        mailT = new JTextField(100);
        mailT.setBounds(250,260,300,30);
        add(mailT);
        
       //TELEFONO
        telL = new JLabel("Teléfono: ");
        telL.setBounds(190,300,150,50);
        add(telL);
        
        telT = new JTextField(20);
        telT.setBounds(250,310,300,30);
        add(telT);
        
       //SEDE
       sedeL = new JLabel("Sede Nª: ");
       sedeL.setBounds(190,350,150,50);
       add(sedeL);
       
       sedeT = new JTextField(2);
       sedeT.setBounds(250,360,50,30);
       add(sedeT);
      
       
       //COMISION
       comL = new JLabel("Comisión: ");
       comL.setBounds(350,350,150,50);
       add(comL);
       
       comT = new JTextField(4);
       comT.setBounds(415,360,50,30);
       add(comT);
       
       //CURSO
       curL = new JLabel("Curso: ");
       curL.setBounds(190,400,150,50);
       add(curL);
       
       curT = new JTextField(300);
       curT.setBounds(250,410,300,30);
       add(curT);
       
        //Botones
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(190,500,100,40);
        add(btnAceptar);
        btnAceptar.addActionListener(this);
    
        btnSalir= new JButton("Salir");
        btnSalir.setBounds(450,500,100,40);
        add(btnSalir);
        btnSalir.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== btnAceptar){
            setTitle(nomT.getText());
        }else{
              if (ae.getSource() == btnSalir){
                System.exit(0);
              }
            }    
        }  
}
