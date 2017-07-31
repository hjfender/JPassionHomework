package com.jpassion.dp.domain;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.getClass().getName() + " notified the " + this.getClass().getName());
	}

}
