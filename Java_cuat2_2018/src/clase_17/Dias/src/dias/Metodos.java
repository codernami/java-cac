/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias;

import javax.swing.JOptionPane;

/**
 *
 * @author Amanda
 */
public class Metodos {
    
    public void cartelito(String texto){
        JOptionPane.showMessageDialog(null, texto);        
    }
    
    public void numero(String nombre){
        try{
            
        
        switch(nombre){
            case "lunes":
                cartelito("Es el día nro 1");
                break;
            case "martes":
                cartelito("Es el día nro 2");
                break;
            case "miercoles":
                cartelito("Es el día nro 3");
                break;
            case "jueves":
                cartelito("Es el día nro 4");
                break;
            case "viernes":
                cartelito("Es el día nro 5");
                break;
            default:
               // cartelito("No se encuentra entre las opciones");
            throw new IllegalArgumentException("Día erróneo: "+ nombre);
        }
        } catch (Exception e){
            cartelito("Ocurrió un error");
                System.out.println(e);
        }
         
        }
    }

//clase 18 continuación de la clase 17. agrego un try catch
//borro la instrucción debajo de default. lo pongo en comentario
