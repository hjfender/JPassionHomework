package com.jpassion.beans1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpassion.beans2.FamilyInfo;

@Component
public class Person {
	private String name = "Sang Shin";
	private int age = 77;
	private float height = 1.99f;
	private boolean isProgrammer = true;

	@Autowired
	private Address address;
	
	@Autowired
	private FamilyInfo familyInfo;
	
	public FamilyInfo getFamilyInfo() {
		return familyInfo;
	}

	public Address getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return isProgrammer;
	}

	public void setProgrammer(boolean isProgrammer) {
		this.isProgrammer = isProgrammer;
	}

}
