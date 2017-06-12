/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myowneventexample;

import java.util.ArrayList;

/**
 *
 * @author henry
 */
public class MyOwnEventSource implements java.io.Serializable {
    
    // Declare an array list to maintain the list of listeneres
    ArrayList<MyOwnEventListenerImpl> listeners = new ArrayList();
    
    public void addMyOwnEventListenerImpl(MyOwnEventListenerImpl i){
        listeners.add(i);
    }
    
    public void removeMyOwnEventListenerImpl(MyOwnEventListenerImpl i){
        listeners.remove(i);
    }
    
    public void triggerEvent(){
        for(MyOwnEventListenerImpl listener : listeners){
            listener.handleEvent(new MyOwnEvent(this));
        }
    }
}
