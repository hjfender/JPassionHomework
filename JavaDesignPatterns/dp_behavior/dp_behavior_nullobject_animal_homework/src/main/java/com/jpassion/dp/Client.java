package com.jpassion.dp;

import com.jpassion.dp.domain.AbstractAnimal;
import com.jpassion.dp.domain.AnimalDataset;

// TODO (Homework): Create animal data set with "Monkey", "Deer", "Lion", and "Bird"
// Try to get animal of "Monkey", "Deer", "Cheetah", and "Tiger". 
// Use null object pattern for non-existent animal such as "Tiger".
//
// <Steps to follow>
// 0. Uncomment the client code below
// 1. Create "AnimalDataset" class (skeleton code is provided), 
//    which contains the animal data set
// 1. Create "AbstractAnimal" abstract class, which contains
//    "public abstract String getAnimal();" method
// 2. Create "RealAnimal" and "NullAnimal" classes, which
//    extends "AbstractAnimal" abstract class.

// Running this application might result in as following
//
// Monkey
// Deer
// Not available in Animal dataset
// Not available in Animal dataset

public class Client {

	public static void main(String[] args) {

		AbstractAnimal student1 = AnimalDataset.getAnimal("Monkey");
		AbstractAnimal student2 = AnimalDataset.getAnimal("Deer");
		AbstractAnimal student3 = AnimalDataset.getAnimal("Cheetah");
		AbstractAnimal student4 = AnimalDataset.getAnimal("Tiger");

		System.out.println(student1.getAnimal());
		System.out.println(student2.getAnimal());
		System.out.println(student3.getAnimal());
		System.out.println(student4.getAnimal());

	}
}
