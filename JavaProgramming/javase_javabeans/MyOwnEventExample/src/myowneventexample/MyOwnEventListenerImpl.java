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
public class MyOwnEventListenerImpl implements MyOwnEventListenerInterface {

    @Override
    public void handleEvent(MyOwnEvent myOwnEvent) {
        System.out.println(myOwnEvent.getCurrentTime());
    }
    
}
