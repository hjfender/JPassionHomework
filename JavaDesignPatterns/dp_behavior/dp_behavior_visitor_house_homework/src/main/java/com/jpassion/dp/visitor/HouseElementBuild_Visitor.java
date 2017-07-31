package com.jpassion.dp.visitor;

import com.jpassion.dp.visitable.Bathroom_Visitable;
import com.jpassion.dp.visitable.Bedroom_Visitable;
import com.jpassion.dp.visitable.House_Visitable;
import com.jpassion.dp.visitable.Kitchen_Visitable;

public class HouseElementBuild_Visitor implements IHouseElement_Visitor {

	@Override
	public void visit(Bedroom_Visitable bedroom) {
		System.out.println("Building " + bedroom.getName());
	}

	@Override
	public void visit(Bathroom_Visitable bathroom) {
		System.out.println("Building " + bathroom.getName());
	}

	@Override
	public void visit(Kitchen_Visitable kitchen) {
		System.out.println("Building kitchen");
	}

	@Override
	public void visit(House_Visitable house) {
		System.out.println("Building house");
	}

}
