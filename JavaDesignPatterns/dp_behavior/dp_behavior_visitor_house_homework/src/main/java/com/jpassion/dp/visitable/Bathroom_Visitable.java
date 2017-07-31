package com.jpassion.dp.visitable;

import com.jpassion.dp.visitor.IHouseElement_Visitor;

public class Bathroom_Visitable implements IHouseElement_Visitable {

	private String name;

	public Bathroom_Visitable(String name) {
		this.setName(name);
	}

	@Override
	public void accept(IHouseElement_Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
