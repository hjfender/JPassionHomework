package org.me.models;

/**
 * This class represents a car owned by {@link Person}.
 * @author sang
 * @see Person
 */
public class Car {
    private String brand;
    private int maxVelocity;

    /**
     * This method accelerates the car by the factor specified by
     * the parameter factor.
     * @param factor The factor for acceleration.
     */
    public void accelerate (int factor){
        maxVelocity += factor;
    }

    /**
     * Returns the brand of the car.
     * @return A String containing the brand
     */
    public String getBrand(){
        return brand;
    }

}
