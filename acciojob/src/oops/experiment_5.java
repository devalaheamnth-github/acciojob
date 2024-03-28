package oops;

public class experiment_5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 Bike2 obj = new Bike2();//creating object  
		  obj.run();//calling method
	}

}
class Vehicle
	{  
	  //defining a method  
	  static void run()
	  {
		  System.out.println("Vehicle is running");
		  }
	  static void run(int a)
	  {
		  System.out.println("Vehicle is running with a");
	  }
	}  
	//Creating a child class  
class Bike2 extends Vehicle
	{  
	  //defining the same method as in the parent class  
	  static void run()																	
//	Multiple markers at this line
//	- overrides oops.Vehicle.run
//	- This instance method cannot override the static method 
//	 from Vehicle when static keyword given in this method
	  {
		  System.out.println("Bike is running safely");
		  }  
	   
	   
	  }  
	 //static method cannot be overideen;
