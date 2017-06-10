/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myowneventexample;

import java.util.Date;

/**
 *
 * @author henry
 */
public class MyOwnEvent extends java.util.EventObject{
    
    MyOwnEvent(MyOwnEventSource source) {
        super(source);
    }
 
    public Date getCurrentTime(){
        return new Date();
    }
}
