package com.jpassion.dp;

import com.jpassion.dip.domain.Circle;
import com.jpassion.dip.domain.IAreaComputable;
import com.jpassion.dip.domain.IDrawable;
import com.jpassion.dip.domain.Line;
import com.jpassion.dip.domain.Rectangle;

public class Client {

	public static void main(String[] args) {
		IAreaComputable circle = new Circle(5.0);
		System.out.println("circle area = " + circle.computeArea());
		
		IAreaComputable rectangle = new Rectangle(5.0,8.0);
		System.out.println("rectangle area = " + rectangle.computeArea());
		
		IDrawable line = new Line(3.0);
		line.draw();
	}
}
