package com.jpassion.dp;

public class File extends Node {

	private String contents;
	
	public File(String name, String contents) {
		super(name);
		this.contents = contents;
	}
	
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public void printTree() {
		System.out.println("  File contents: " + getContents());
	}

}
