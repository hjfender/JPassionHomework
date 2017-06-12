package org.me.models;

/**
 * This class is related with {@link Car} class.
 * @author sang
 * @see Person
 */
public class Person {
    private String name;
    private Car car;

    public Person(String name){
        this.name = name;
    }

    /**
     * Sets the car for this person.
     * @param car A Car object instance.
     */
    public void setCar(Car car){
        this.car = car;
    }

    /**
     * Say a greeting.
     * @return A String that has Hello and name.
     */
    public String sayHello(){
        return "Hello " + name;
    }

}
