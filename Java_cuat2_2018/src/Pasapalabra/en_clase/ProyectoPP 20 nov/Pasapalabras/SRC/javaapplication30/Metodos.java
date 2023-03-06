/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author balbi
 */
public class Metodos {
    public int segundos=60;
    
    public void btncolor(JButton nombre,String color){
        ImageIcon redondo = new ImageIcon(getClass().getResource(color+".png"));
        int alto = nombre.getHeight();
        int ancho = nombre.getWidth();
        ImageIcon boton = new
                ImageIcon(redondo.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        nombre.setIcon(boton);
    }
    
 public void cartel(JLabel pregunta){
       Thread letras;
       letras = new Thread(){
                public void run(){    
    for(int i = 0; i < 40; i++) {   
      pregunta.setFont(
         new java.awt.Font("Tahoma",1,i));
      try {
          Thread.sleep(10);
      } catch (InterruptedException ex) {
          System.out.println("Error en el Hilo");
      }
       }}};
        letras.start();
   }
 public void tiempo(JButton cuenta){
       Thread tiempo;
       tiempo = new Thread(){
                public void run(){    
    for(int i = 60; i > 0; i--) {   
      cuenta.setText(String.valueOf(i));
      try {
          Thread.sleep(1000);
          if(i>segundos){
              i=segundos;
          }
      } catch (InterruptedException ex) {
          System.out.println("Error en el Hilo");
      }
       }}};
        tiempo.start();
   }

    

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

  
}
