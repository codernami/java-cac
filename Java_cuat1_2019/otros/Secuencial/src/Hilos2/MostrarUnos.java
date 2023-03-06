/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos2;

/**
 *
 * @author Amanda
 */
public class MostrarUnos implements Runnable{
    private Thread t;
    public MostrarUnos(){
        t= new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("1");
            
        }
    }
}
