package com.jpassion.dp;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {

	private final List<Node> children = new ArrayList<>();
	
	public Directory(String name) {
		super(name);
	}
	
	public void add(Node e) {
		children.add(e);
	}
	
	public void remove(Node e) {
		children.remove(e);
	}
	
	@Override
	public void printTree() {
		System.out.println("Directory: " + getName());
		children.stream()
				.forEach(Node::printTree);
	}

}
