package com.tnsif.day5.Constructor;

public class Constructor {
	String name;//data members &instance variable
	int age;
	String dept;
	
	//default constructor
	public Constructor() {
		System.err.println("default constructor");
	}
	public Constructor(String ConstructorName, int ConstructorAge, String ConstructorDept) {
		System.out.println("Parameter Constructor");
		this.name = ConstructorName;
		this.age = ConstructorAge;
		this.dept = ConstructorDept;
		
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
	    return "OopsConcept[Name=" + name + ", Age=" + age + ", Dept=" + dept + "]";
	}
	
	
	public static void main(String[] args) {
		Constructor obj=new Constructor("Vishnu",21,"ECE");
		System.out.println(obj.toString());
	}}
