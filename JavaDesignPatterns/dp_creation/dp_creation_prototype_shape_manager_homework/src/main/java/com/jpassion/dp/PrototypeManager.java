package com.jpassion.dp;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	
	private Map<Object, Shape> mapOfPrototype = new HashMap<Object, Shape>();
	
	public void addPrototype(Object key, Shape prototype){
		mapOfPrototype.put(key, prototype);
	}
	
	public Shape clonePrototype(Object key){
		return mapOfPrototype.get(key).cloneIt();
	}

}
