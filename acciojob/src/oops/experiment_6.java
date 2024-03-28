package oops;

public class experiment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TestClas ts=new TestClas();
			ts.showw();
	}

}
interface TestInterface111
{ 
	// default method 
	default void showw() 
	{ 
		System.out.println("Default TestInterface1");
		
	} 
} 

interface TestInterface222 extends TestInterface111
{ 
	// Default method 
	default void showw() 
	{ 
		System.out.println("Default TestInterface2"); 
	} 
} 

//Implementation class code 
class TestClas implements TestInterface222
{ 
////	 void showw()
//	{
//		
//	}
	
}




//	A class implementation of a method takes precedence over a default method. So, if the class already has the same method as an 
//Interface, then the default method from the implemented Interface does not take effect.

//	However, if two interfaces implement the same default method, then there is a conflict.

//	In cases where one interface inherits another interface and both of them implement a default method, an implementing class would 
//use the default method of the child interface.

//	Also, an explicit call to an interface default method can be made from inside an implementing class using super. 
//For example Interface.super.defaultMethod().