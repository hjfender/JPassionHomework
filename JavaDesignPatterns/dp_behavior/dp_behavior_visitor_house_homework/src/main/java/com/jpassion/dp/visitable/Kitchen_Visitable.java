package com.jpassion.dp.visitable;

import com.jpassion.dp.visitor.IHouseElement_Visitor;

public class Kitchen_Visitable implements IHouseElement_Visitable {

	@Override
	public void accept(IHouseElement_Visitor visitor) {
		visitor.visit(this);
	}

}
