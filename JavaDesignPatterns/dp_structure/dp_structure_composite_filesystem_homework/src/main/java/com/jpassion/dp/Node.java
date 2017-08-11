package com.jpassion.dp;

public abstract class Node {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public Node(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract void printTree();
}
