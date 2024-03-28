package oops;

public class experiment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//A simple Java program to demonstrate multiple 
//inheritance through default methods. 
interface TestInterface1 
{ 
	// default method 
	default void show() 
	{ 
		System.out.println("Default TestInterface1");
		
	} 
} 

interface TestInterface2 
{ 
	// Default method 
	default void show() 
	{ 
		System.out.println("Default TestInterface2"); 
	} 
} 

//Implementation class code 
class TestClass implements TestInterface1,TestInterface2
{ 
//	 Overriding default show method 
	public void show() 
	{ 
		// use super keyword to call the show 
		// method of TestInterface1 interface 
//		TestInterface1.super.show(); 
		System.out.println("in test class with Default TestInterface");
		// use super keyword to call the show 
		// method of TestInterface2 interface 
//		TestInterface2.super.show(); 
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.show(); 
	} 
} 

//A class implementation of a method takes precedence over a default method. So, if the class already has the same method as an 
//Interface, then the default method from the implemented Interface does not take effect.

//However, if two interfaces implement the same default method, then there is a conflict.

//In cases where one interface inherits another interface and both of them implement a default method, an implementing class would 
//use the default method of the child interface.

//Also, an explicit call to an interface default method can be made from inside an implementing class using super. 
//For example Interface.super.defaultMethod().
