package com.jpassion.dp.domain;

public class ShapeDrawer {

	//GOOD DESIGN: Any shape can be handled
	IShape shape;
	
	public ShapeDrawer(IShape shape){
		this.shape = shape;
	}
	
	public void setShape(IShape shape){
		this.shape = shape;
	}
	
	public void draw(){
		shape.draw();
	}
}
