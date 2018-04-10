
package tictak3_v2;


public class getTwo implements Runnable{
    private Thread thread;
    Object monitor;
    
    public getTwo(Object monitor) {
        this.monitor=monitor;
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run() {
        for (int i = 0; i < TicTak3_v2.NUM; i++) {
        
        while(TicTak3_v2.monitorCounter!=TicTak3_v2.SECOND){}
                     
            System.out.print(" 2 ");
            TicTak3_v2.monitorCounter=TicTak3_v2.THIRD;
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