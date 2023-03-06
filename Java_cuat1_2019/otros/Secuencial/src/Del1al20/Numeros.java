/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Del1al20;

/**
 *
 * @author alumno
 */
public class Numeros extends Thread {
    @Override
    public void run(){
        try{
        for (int i = 1; i < 21; i++) {
            System.out.println(i + "-");
            sleep(1500);
        }
        }catch (InterruptedException ex){
        }
    }
}
