package oops;

public class constructor_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChildClass obj = new MyChildClass();
	}

}
class MyParentClass 
//	{
//	   MyParentClass()
//	   {
//		System.out.println("MyParentClass Constructor");
//	   }
	}
class MyChildClass extends MyParentClass
	{

	   MyChildClass() 
	   {
		System.out.println("MyChildClass Constructor");
	   }
		
	}
