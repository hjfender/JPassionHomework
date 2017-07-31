package com.jpassion.dp.visitor;

import com.jpassion.dp.visitable.Bathroom_Visitable;
import com.jpassion.dp.visitable.Bedroom_Visitable;
import com.jpassion.dp.visitable.House_Visitable;
import com.jpassion.dp.visitable.Kitchen_Visitable;

public interface IHouseElement_Visitor {
    void visit(Bedroom_Visitable bedroom);
    void visit(Bathroom_Visitable bathroom);
    void visit(Kitchen_Visitable kitchen);
    void visit(House_Visitable house);
}
