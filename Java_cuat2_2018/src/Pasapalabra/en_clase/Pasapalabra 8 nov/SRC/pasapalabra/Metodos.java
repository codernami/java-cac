package pasapalabra;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Metodos {
    public void BTNColor(JButton nombre,String color){
        ImageIcon redondo = new ImageIcon(getClass().getResource(color));
        
        int alto = nombre.getHeight();
        int ancho = nombre.getWidth();
        
        ImageIcon boton = new ImageIcon(
        redondo.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        nombre.setIcon(boton);
        
    }
}
