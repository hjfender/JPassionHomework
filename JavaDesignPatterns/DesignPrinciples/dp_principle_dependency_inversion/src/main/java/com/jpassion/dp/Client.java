package com.jpassion.dp;

import com.jpassion.dp.domain.Circle;
import com.jpassion.dp.domain.Rectangle;
import com.jpassion.dp.domain.ShapeDrawer;
import com.jpassion.dp.domain.Triangle;

public class Client {

	public static void main(String[] args) {
		ShapeDrawer shapeDrawer = new ShapeDrawer(new Circle());
		shapeDrawer.draw();
		
		shapeDrawer.setShape(new Rectangle());
		shapeDrawer.draw();
		
		shapeDrawer.setShape(new Triangle());
		shapeDrawer.draw();
	}
}
