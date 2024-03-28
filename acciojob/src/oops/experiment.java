package oops;

public class experiment {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		System.out.println("Hello main");  
	}
}

interface a
{
	static void ifun1()//This method requires a body instead of a semicolon
	{
		System.out.println("in static fun of interface");
	}
	default void ifun2()//This method requires a body instead of a semicolon
	{
		System.out.println("in def fun of interface");
	}
	private void ifun6()//This method requires a body instead of a semicolon
	{
		System.out.println("in private fun of interface");
	}
//	final void ifun7();
//	Illegal modifier for the interface method ifun7; only public, private, abstract, default, static and strictfp are 
//			 permitted.
	
//	final void ifun7()
//	{
//	Illegal modifier for the interface method ifun7; only public, private, abstract, default, static and strictfp are 
//	 permitted
//	- Abstract methods do not specify a body
//	}
	
//	protected void ifun8();
//	Illegal modifier for the interface method ifun7; only public, private, abstract, default, static and strictfp are 
//  permitted.
//	But, we do not inherit an interface we will implement it.
	
//	protected void ifun8() 
//	{
//	Illegal modifier for the interface method ifun7; only public, private, abstract, default, static and strictfp are 
// permitted
// - Abstract methods do not specify a body
//	}
	abstract void ifun3();
	public void ifun4();
	public void ifun5();
	
}
abstract class b implements a
{
	static void met3()//This method requires a body instead of a semicolon
	{
		System.out.println("in abstract method3 of static");
	}
//	default void met4()//Default methods are allowed only in interfaces.
//	{
//		System.out.println("in abstract method4 of static");
//	}
	private void met5()//This method requires a body instead of a semicolon
	{
		System.out.println("in abstract method5 of private");
	}
	final void met6()//This method requires a body instead of a semicolon
	{
		System.out.println("in abstract method6 of final");
	}
	protected void met7()//This method requires a body instead of a semicolon
	{
		System.out.println("in abstract method7 of protected");
	}
	abstract void met1();
	abstract void met2();
	public void method2()
	{
		System.out.println("in abstract method2");
	}
	public void ifun3()
	{
		System.out.println("in ifun3 in abstract"); //we can also define interface method in abstract class.
	}
}
class c extends b
{
	void met1()
	{
		System.out.println("in class method1");
	}
	void met2()
	{
		System.out.println("in class method2");
	}
	public void ifun4()
	{
		System.out.println("in ifun4 of class");
	}
	public void ifun5()
	{
		System.out.println("in ifun5 of class");
	}
	
	
}