/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author alumno
 */
public class CerosConHilos extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("0");
            
        }
    }
    
}
