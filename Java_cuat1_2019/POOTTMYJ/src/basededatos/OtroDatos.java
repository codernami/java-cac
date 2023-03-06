package basededatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtroDatos extends javax.swing.JFrame implements ActionListener{
    
    protected JLabel nom, ape, naci, dia, mes, anio, nac, idio, est, dir, calle, nro, piso, dpto, loc;
    protected JTextField txtNom, txtApe, txtCalle, txtNro, txtPiso, txtDpto, txtLoc;
    protected JButton btnA, btnS;
    protected JComboBox comboNac, cmbDia, cmbMes, cmbAnio;
    protected JCheckBox opc1, opc2, opc3, opc4, opc5;
    protected ButtonGroup bgEstado;
    protected JRadioButton radio1, radio2, radio3, radio4, radio5;
    
    public OtroDatos(){
        setLayout(null); 
                
        //Etiquetas label
        nom = new JLabel("Nombre: ");
        nom.setBounds(80,40,100,50);
        add(nom);
    
        ape = new JLabel("Apellido: ");
        ape.setBounds(80,80,100,50);
        add(ape);
    
        naci = new JLabel("F. Nacimiento:");
        naci.setBounds(80,130,150,50);
        add(naci);
    
        dia = new JLabel("Día");
        dia.setBounds(170,130,50,50);
        add(dia);
        
        mes = new JLabel("Mes");
        mes.setBounds(255,130,50,50);
        add(mes);
        
        anio = new JLabel("Año");
        anio.setBounds(345,130,50,50);
        add(anio);
        
        nac = new JLabel("Nacionalidad:");
        nac.setBounds(80,175,150,50);
        add(nac);
        
        idio = new JLabel("Idiomas");
        idio.setBounds(80,220,100,50);
        add(idio);
        
        est = new JLabel("Estado Civil");
        est.setBounds(300,220,150,50);
        add(est);
        
        dir = new JLabel("Dirección ");
        dir.setBounds(460,220,100,50);
        add(dir);
        
        calle = new JLabel("Calle: ");
        calle.setBounds(460,270,100,50);
        add(calle);
        
        nro = new JLabel("N°: ");
        nro.setBounds(460,320,50,50);
        add(nro);
        
        piso = new JLabel("Piso: ");
        piso.setBounds(545,320,50,50);
        add(piso);
        
        dpto = new JLabel("Dpto: ");
        dpto.setBounds(635,320,50,50);
        add(dpto);
        
        loc = new JLabel("Localidad: ");
        loc.setBounds(460,375,100,50);
        add(loc);
        
        //Cuadros de texto
        txtNom = new JTextField();
        txtNom.setBounds(140,50,300,28);
        add(txtNom);
        
        txtApe = new JTextField();
        txtApe.setBounds(140,90,300,28);
        add(txtApe);
        
        txtCalle = new JTextField();
        txtCalle.setBounds(500,280,320,25);
        add(txtCalle);
        
        txtNro = new JTextField();
        txtNro.setBounds(485,330,50,25);
        add(txtNro);
    
        txtPiso = new JTextField();
        txtPiso.setBounds(580,330,30,25);
        add(txtPiso);
        
        txtDpto = new JTextField();
        txtDpto.setBounds(670,330,30,25);
        add(txtDpto);
        
        txtLoc = new JTextField();
        txtLoc.setBounds(525,385,295,25);
        add(txtLoc);
        
        //Nacionalidad
        comboNac = new JComboBox();
        comboNac.setBounds(170,185,100,28);        
        comboNac.addItem("Alemán");
        comboNac.addItem("Argentino");
        comboNac.addItem("Brasileño");  
        comboNac.addItem("Chileno");
        comboNac.addItem("Danés");
        add(comboNac);
        
        //Fecha de nacimiento
        cmbDia = new JComboBox();
        cmbDia.setBounds(195,140,45,25);
        for (int i = 1; i <=31; i++) {
            cmbDia.addItem(i);
        }
        add(cmbDia);
       
        cmbMes = new JComboBox();
        cmbMes.setBounds(285,140,45,25);
        for (int i = 1; i <= 12; i++) {
            cmbMes.addItem(i);
        }
        add(cmbMes);
        
        cmbAnio = new JComboBox();
        cmbAnio.setBounds(375,140,60,25);
        for (int i = 1940; i <=2040; i++) {
            cmbAnio.addItem(i);
        }
        add(cmbAnio);
        
        //Idiomas
        opc1 = new JCheckBox("Inglés");
        opc1.setBounds(75,270,100,30);        
        add(opc1);
       
        opc2 = new JCheckBox("Francés");
        opc2.setBounds(75,305,100,30);        
        add(opc2);
        
        opc3 = new JCheckBox("Alemán");
        opc3.setBounds(75,340,100,30);        
        add(opc3);
        
        opc4 = new JCheckBox("Italiano");
        opc4.setBounds(75,375,100,30);        
        add(opc4);
        
        opc5 = new JCheckBox("Otros");
        opc5.setBounds(75,410,100,30);        
        add(opc5);
       
        //Estado civil       
        bgEstado = new ButtonGroup();
        
        radio1 = new JRadioButton("Soltero");
        radio1.setBounds(290,270,90,30);
        bgEstado.add(radio1);
        add(radio1);

        radio2 = new JRadioButton("Casado");
        radio2.setBounds(290,305,90,30);
        bgEstado.add(radio2);
        add(radio2);
        
        radio3 = new JRadioButton("Separado");
        radio3.setBounds(290,340,90,30);
        add(radio3);
        bgEstado.add(radio3);
        
        radio4 = new JRadioButton("Unión civil");
        radio4.setBounds(290,375,90,30);
        add(radio4);
        bgEstado.add(radio4);
        
        radio5 = new JRadioButton("Viudo");
        radio5.setBounds(290,410,90,30);
        add(radio5);
        bgEstado.add(radio5);
               
        //Botones
        btnA = new JButton("Aceptar");
        btnA.setBounds(270,530,90,30);
        add(btnA);
        btnA.addActionListener(this);
    
        btnS= new JButton("Salir");
        btnS.setBounds(430,530,90,30);
        add(btnS);
        btnS.addActionListener(this);
    }    
    @Override
    public void actionPerformed(ActionEvent ae){
    
        if (ae.getSource()== btnA){
            
        }else{
              if (ae.getSource() == btnS){
                System.exit(0);
              }
            }    
        }      
}

