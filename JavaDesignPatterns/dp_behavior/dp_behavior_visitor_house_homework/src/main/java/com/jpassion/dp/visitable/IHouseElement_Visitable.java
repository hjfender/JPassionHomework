package com.jpassion.dp.visitable;

import com.jpassion.dp.visitor.IHouseElement_Visitor;

public interface IHouseElement_Visitable {
    void accept(IHouseElement_Visitor visitor);
}
