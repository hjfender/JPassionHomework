package com.jpassion.dp.visitable;

import com.jpassion.dp.visitor.IHouseElement_Visitor;

public class House_Visitable implements IHouseElement_Visitable {
	
    IHouseElement_Visitable[] elements;

    public House_Visitable(IHouseElement_Visitable[] elements) {
		this.elements = elements;
	}

	public void accept(IHouseElement_Visitor visitor) {    
        for(IHouseElement_Visitable elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);    
    }
}