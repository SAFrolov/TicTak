
package tictak3_v2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class getThree implements Runnable{
    private Thread thread;

    Object monitor;
    
    public getThree(Object monitor) {
        this.monitor=monitor;
        thread = new Thread(this);
        thread.start();
    }

    
    @Override
    public void run() {
        for (int i = 0; i < TicTak3_v2.NUM; i++) {
          while(TicTak3_v2.monitorCounter!=TicTak3_v2.THIRD){}
         
            System.out.println("- 3");
            TicTak3_v2.monitorCounter=TicTak3_v2.FIRST; 
            
         synchronized(monitor){
             monitor.notifyAll();
             if(i<TicTak3_v2.NUM-1)
             {
                 try {
                        monitor.wait(); 
            } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
            }

            }
         }
          
        }
      }
    }
    

