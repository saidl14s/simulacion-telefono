/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematelefonico;

import java.util.Timer;
import java.util.TimerTask;

public class Tiempo  {

    private Timer timer = new Timer(); 
    private int segundos=0;

    class Contador extends TimerTask {
        public void run() {
            segundos++;
     System.out.println("segundo: " + segundos);
        }
    }
    
    public void Contar()
    {
        this.segundos=0;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
    }
    
    public void Detener() {
        timer.cancel();
    }
    
    public int getSegundos()
    {
        return this.segundos;
    }
}