
package oops;

public class experiment_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClasss ts= new TestClasss();
		ts.iifun2();
		TestInterface3.iifun3_ti3();/* important*/
		TestInterface22.absstatic();/* important*/
	}

}
//A simple Java program to demonstrate multiple 
//inheritance through default methods.
interface TestInterface3
{
	void iifun3();
	default void iifund3()
	{
		System.out.println("in interface 3 default fun");
	}
	static void iifun3_ti3()
	{
		System.out.println("in interface 3 static fun");
	}
}
interface TestInterface4
{
	public static final int ti4=4;
	void iifun4();
	default void iifund4()
	{
		System.out.println("in interface 4 default fun");
	}
}
interface TestInterface12 
{ 
	void iifun12();
	default void iifund12()
	{
		System.out.println("in interface 12 default fun");
	}
	
}
interface TestInterface11 extends TestInterface3,TestInterface4
{ 
	public static final int ti11=8;
	static int ti111=9;
	void iifun1();
	
	default void iifun2()
	{
		
		System.out.println("in interface 11 default fun"+" "+ti4);
	}
	
	
} 

abstract  class TestInterface22 implements TestInterface11,TestInterface12 // not necessary to implement interface method as derived class should 
										//take care of
{ 
	int ti22=5;
	abstract void aafun1();
	TestInterface22()
	{
		System.out.println("in abstract constructor");
	}
	void aafun2()
	{
//		ti11++;   The final field TestInterface11.ti11 cannot be assigned
		
		System.out.println(ti11+ti22);// The final field ti11 can only be assigned.
	}
	public void iifun3()
	 {
		 System.out.println("in abstract");
	 }
	static void absstatic()
	{
		System.out.println("in abstract with static ");
	}
	
	
	 
} 

//Implementation class code 
class TestClasss extends TestInterface22
{ 
	int tci =10;
	public void iifun1()
	{
		System.out.println("in testclass with interface");
	}
	
	 public void iifun12()
	 {
		 ti22++;
		 System.out.println("in testclass with interface112,,"+ti22);
	 }
//	 public void iifun3()
//	 {
//		 System.out.println("in testclass with interface112");
//	 }
	 public void iifun4()
	 {
		 System.out.println("in testclass with interface112");
	 }
	 void aafun1()
		{
		 System.out.println("in testclass with abstract");
		}
	
	TestClasss()
	{
		System.out.println("in testclass constructor non par");
	}
	TestClasss(int n)
	{
		System.out.println("in testclass constructor  par");

	}
	

	 
} 
