package com.tnsif.day09.Interfaces.WrapperClasses;

interface one {
	// only absract method 
	// will have default public abstract
	int age =20;  // age is considered as final and static
	void show(); // default public abstract
	}
class two implements one{
	@Override
	public void show() {
		System.out.println("Interface Method one");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		two obj=new two();
		obj.show();
	}

}
