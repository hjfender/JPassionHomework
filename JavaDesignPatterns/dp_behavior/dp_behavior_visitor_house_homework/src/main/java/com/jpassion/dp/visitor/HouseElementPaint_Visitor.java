package com.jpassion.dp.visitor;

import com.jpassion.dp.visitable.Bathroom_Visitable;
import com.jpassion.dp.visitable.Bedroom_Visitable;
import com.jpassion.dp.visitable.House_Visitable;
import com.jpassion.dp.visitable.Kitchen_Visitable;

public class HouseElementPaint_Visitor implements IHouseElement_Visitor {

	@Override
	public void visit(Bedroom_Visitable bedroom) {
		System.out.println("Painting " + bedroom.getName());
	}

	@Override
	public void visit(Bathroom_Visitable bathroom) {
		System.out.println("Painting " + bathroom.getName());
	}

	@Override
	public void visit(Kitchen_Visitable kitchen) {
		System.out.println("Painting kitchen");
	}

	@Override
	public void visit(House_Visitable house) {
		System.out.println("Painting house");
	}

}
