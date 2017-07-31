package com.jpassion.dp;

import com.jpassion.dp.visitable.Bathroom_Visitable;
import com.jpassion.dp.visitable.Bedroom_Visitable;
import com.jpassion.dp.visitable.House_Visitable;
import com.jpassion.dp.visitable.IHouseElement_Visitable;
import com.jpassion.dp.visitable.Kitchen_Visitable;
import com.jpassion.dp.visitor.HouseElementBuild_Visitor;
import com.jpassion.dp.visitor.HouseElementDecorate_Visitor;
import com.jpassion.dp.visitor.HouseElementPaint_Visitor;

// TODO (Homework): Write code so that the house gets constructed with
// a kitchen, 2 bedrooms, 2 bathrooms. Each of these should be built
// and then painted.
//
// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "IHouseElement_Visitable" interface (provided with commented code), 
//    which has "accept(IHouseElement_Visitor visitor)" method
// 2. Create implementation classes of "IHouseElement_Visitable" interface -
//    "House_Visitable" (provided with commented code), "Kitchen_Visitable", 
//    "Bedroom_Visitable", "Bathroom_Visitable" classes. Note that "House_Visitable"
//    class has "IHouseElement_Visitable[] elements;" field.
// 3. Create "IHouseElement_Visitor" interface (provided with commented code),
//    which has overloaded visit() methods, each of which takes object of concrete 
//    Visitable class
// 4. Create "HouseElementBuild_Visitor" and "HouseElementPaint_Visitor"
//    concrete classes implementing "IHouseElement_Visitor" interface
//
// <Optional steps>
// 5. Create "HouseElementDecorate_Visitor" class (Note that you don't have
//    change any of the visitable classes)

//Running this application results in something like following
//Building master bedroom
//Building guest bedroom
//Building kitchen
//Building master bathroom
//Building extra bathroom
//Building house
//Painting master bedroom
//Painting guest bedroom
//Painting kitchen
//Painting master bathroom
//Painting extra bathroom
//Painting house

public class Client {

	public static void main(String[] args) {

		IHouseElement_Visitable iHouseElement_Visitable = new House_Visitable(
				new IHouseElement_Visitable[] { new Bedroom_Visitable("master bedroom"),
						new Bedroom_Visitable("guest bedroom"), new Kitchen_Visitable(),
						new Bathroom_Visitable("master bathroom"), new Bathroom_Visitable("extra bathroom") });
		iHouseElement_Visitable.accept(new HouseElementBuild_Visitor());
		iHouseElement_Visitable.accept(new HouseElementPaint_Visitor());
		iHouseElement_Visitable.accept(new HouseElementDecorate_Visitor());

	}
}
