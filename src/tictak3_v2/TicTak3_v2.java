
package tictak3_v2;



public class TicTak3_v2 {
static int NUM=33;
static int FIRST = 1;
static int SECOND = 2;
static int THIRD = 3; 
static int monitorCounter=1;


    public static void main(String[] args) {
        
        Object monitor = new Object();
        
        getOne th1 = new getOne(monitor);
        getTwo th2 = new getTwo(monitor);
        getThree th3 = new getThree(monitor);
    }
    
}
