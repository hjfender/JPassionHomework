package foodpackage.fruitpackage;

public class FoodMain {
	
	public static void main(String[] args){
		//Create a food object
		Food food = new Food();

		//Call a couple methods on the food object
		food.setColor("Red");
		food.setOdor("Sweet");

		//Print out information about the food object
		System.out.println("The food is " + food.getColor() + " and " + food.getOdor());
	}
}