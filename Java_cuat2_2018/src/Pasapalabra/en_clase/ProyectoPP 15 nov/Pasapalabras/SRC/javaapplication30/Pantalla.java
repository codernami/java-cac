
package javaapplication30;

import javax.swing.JButton;

public class Pantalla extends javax.swing.JFrame {
  String preguntas[][] = new String[28][4]; //28 renglones x 4 columnas
  Metodos MM = new Metodos();
  int numero = 0; //variable para saber el número de la pregunta
  
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        //primer columna con las preguntas (0)
        preguntas[0][0] = "Cuantas patas tiene un leon?";
        preguntas[1][0] = "Cuantas patas tiene un gallo ?";
        preguntas[2][0] = "Cuantas patas tiene un araña?";
        preguntas[3][0] = "Cuantas patas tiene un pulpo?";
        
        
        //segunda columna con las respuestas (1)
        preguntas[0][1] = "Cuatro";
        preguntas[1][1] = "Dos";
        preguntas[2][1] = "Ocho";
        preguntas[3][1] = "Treinta";
        
        //comparar las respuestas
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblpregunta = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnTiempo = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnC = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnD = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnE = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnA7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnA8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnA9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnResponder = new javax.swing.JButton();
        btnPasapalabra = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(560, 30, 37, 50);

        lblpregunta.setForeground(new java.awt.Color(255, 255, 0));
        lblpregunta.setText("-");
        lblpregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblpregunta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblpreguntaFocusLost(evt);
            }
        });
        jPanel1.add(lblpregunta);
        lblpregunta.setBounds(130, 360, 680, 60);

        btnIniciar.setText("Iniciar Juego");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar);
        btnIniciar.setBounds(1030, 530, 200, 23);

        btnA.setBackground(new java.awt.Color(51, 255, 204));
        btnA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnA.setBorder(null);
        btnA.setBorderPainted(false);
        btnA.setContentAreaFilled(false);
        btnA.setMaximumSize(new java.awt.Dimension(60, 60));
        btnA.setMinimumSize(new java.awt.Dimension(60, 60));
        btnA.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnA);
        btnA.setBounds(550, 30, 60, 60);

        btnTiempo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnTiempo.setText("Tiempo");
        btnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiempoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTiempo);
        btnTiempo.setBounds(1080, 310, 100, 130);

        btnFin.setText("Finalizar Juego");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        jPanel1.add(btnFin);
        btnFin.setBounds(1030, 250, 200, 23);

        jLabel5.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("C");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(720, 80, 40, 60);

        btnC.setBackground(new java.awt.Color(51, 255, 204));
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setMaximumSize(new java.awt.Dimension(60, 60));
        btnC.setMinimumSize(new java.awt.Dimension(60, 60));
        btnC.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnC);
        btnC.setBounds(710, 80, 60, 60);

        jLabel6.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("B");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 60, 40, 40);

        btnB.setBackground(new java.awt.Color(51, 255, 204));
        btnB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnB.setBorder(null);
        btnB.setBorderPainted(false);
        btnB.setContentAreaFilled(false);
        btnB.setMaximumSize(new java.awt.Dimension(60, 60));
        btnB.setMinimumSize(new java.awt.Dimension(60, 60));
        btnB.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnB);
        btnB.setBounds(630, 50, 60, 60);

        jLabel7.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("D");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 130, 40, 40);

        btnD.setBackground(new java.awt.Color(51, 255, 204));
        btnD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnD.setBorder(null);
        btnD.setBorderPainted(false);
        btnD.setContentAreaFilled(false);
        btnD.setMaximumSize(new java.awt.Dimension(60, 60));
        btnD.setMinimumSize(new java.awt.Dimension(60, 60));
        btnD.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnD);
        btnD.setBounds(770, 120, 60, 60);

        jLabel8.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(830, 170, 37, 60);

        btnE.setBackground(new java.awt.Color(51, 255, 204));
        btnE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnE.setBorder(null);
        btnE.setBorderPainted(false);
        btnE.setContentAreaFilled(false);
        btnE.setMaximumSize(new java.awt.Dimension(60, 60));
        btnE.setMinimumSize(new java.awt.Dimension(60, 60));
        btnE.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnE);
        btnE.setBounds(820, 170, 60, 60);

        jLabel9.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("F");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(877, 250, 40, 40);

        btnA7.setBackground(new java.awt.Color(51, 255, 204));
        btnA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnA7.setBorder(null);
        btnA7.setBorderPainted(false);
        btnA7.setContentAreaFilled(false);
        btnA7.setMaximumSize(new java.awt.Dimension(60, 60));
        btnA7.setMinimumSize(new java.awt.Dimension(60, 60));
        btnA7.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnA7);
        btnA7.setBounds(860, 240, 60, 60);

        jLabel10.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("G");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(900, 320, 50, 50);

        btnA8.setBackground(new java.awt.Color(51, 255, 204));
        btnA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnA8.setBorder(null);
        btnA8.setBorderPainted(false);
        btnA8.setContentAreaFilled(false);
        btnA8.setMaximumSize(new java.awt.Dimension(60, 60));
        btnA8.setMinimumSize(new java.awt.Dimension(60, 60));
        btnA8.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnA8);
        btnA8.setBounds(890, 310, 60, 60);

        jLabel11.setFont(new java.awt.Font("Rubik", 1, 55)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("H");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(910, 400, 40, 40);

        btnA9.setBackground(new java.awt.Color(51, 255, 204));
        btnA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/azul.png"))); // NOI18N
        btnA9.setBorder(null);
        btnA9.setBorderPainted(false);
        btnA9.setContentAreaFilled(false);
        btnA9.setMaximumSize(new java.awt.Dimension(60, 60));
        btnA9.setMinimumSize(new java.awt.Dimension(60, 60));
        btnA9.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel1.add(btnA9);
        btnA9.setBounds(900, 390, 60, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/ecualizador.gif"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 630, 310, 76);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASAPALABRA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(820, -10, 430, 120);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("PASAPALABRA");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(840, 0, 430, 120);

        txtRespuesta.setBackground(new java.awt.Color(51, 204, 0));
        txtRespuesta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        txtRespuesta.setText("Tu respuesta aquí...");
        txtRespuesta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRespuesta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRespuestaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespuestaFocusLost(evt);
            }
        });
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRespuesta);
        txtRespuesta.setBounds(130, 440, 680, 70);

        btnResponder.setText("Responder");
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        jPanel1.add(btnResponder);
        btnResponder.setBounds(130, 550, 100, 23);

        btnPasapalabra.setText("Pasapalabra");
        jPanel1.add(btnPasapalabra);
        btnPasapalabra.setBounds(340, 550, 120, 23);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication30/fondoazul.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 20, 1420, 680);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
      
        MM.btncolor(cuales(1), "amarillo");
 //   MM.btncolor(btnA, "verde");
    lblpregunta.setText(preguntas[0][0]);
    MM.cartel(lblpregunta);
    MM.tiempo(btnTiempo);
   
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
       lblpregunta.setText("");
       MM.setSegundos(0);
    }//GEN-LAST:event_btnFinActionPerformed

    private void btnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiempoActionPerformed

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void txtRespuestaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespuestaFocusGained
    
      this.txtRespuesta.setText(""); //me quesa limpio el cuadro de texto
      
      
    }//GEN-LAST:event_txtRespuestaFocusGained

    private void txtRespuestaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespuestaFocusLost
    //  
    }//GEN-LAST:event_txtRespuestaFocusLost

    private void lblpreguntaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblpreguntaFocusLost

        
    }//GEN-LAST:event_lblpreguntaFocusLost

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        String respuesta;
        respuesta = this.txtRespuesta.getText();
        respuesta = respuesta.trim(); //quito espacios en blanco
        this.txtRespuesta.setText("Tu respuesta aquí...");
        
        if(preguntas[numero][1].equalsIgnoreCase(respuesta)){ //numero vale 0
            
            System.out.println("ok");
        }else{
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnResponderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

      public JButton cuales(int numero){
        //responde a un valor, a un objeto. la respuesta va a ser un botón
        switch(numero){
            case 1:
                return btnA;
            case 2:
                return btnB;
            case 3:
                return btnC;
            case 4:
                return btnD;
            default:
                return btnA;
        }
    
      }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnFin;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPasapalabra;
    private javax.swing.JButton btnResponder;
    private javax.swing.JButton btnTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpregunta;
    private javax.swing.JTextField txtRespuesta;
    // End of variables declaration//GEN-END:variables
}
