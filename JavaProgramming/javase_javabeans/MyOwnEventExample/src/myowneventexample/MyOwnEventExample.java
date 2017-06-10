/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myowneventexample;

/**
 *
 * @author henry
 */
public class MyOwnEventExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MyOwnEventSource source = new MyOwnEventSource();
        
        source.addMyOwnEventListenerImpl(new MyOwnEventListenerImpl());
        
        for (int i = 0; i < 10; i++) {
            source.triggerEvent();
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        }
        
    }
    
}
