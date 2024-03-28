package oops;

public class experiment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//public interface TestInterface1() //Multiple markers at this line
//									- The public type TestInterface1 must be defined in its own file
//									
//private interface TestInterface1()
									//Multiple markers at this line
									//- Illegal modifier for the interface TestInterface1; only public & abstract are 
									// permitted
									//- Syntax error on token "interface", @ expected
//protected interface TestInterface1()
//static interface TestInterface1()

						//only public abstract & final are permitted
abstract interface TestInterface1
{
	void ifun1();
//	int ifun1(); 		same function can not be defined in same interface  with also diffrentiating by return type also.
	default void samefuninin()
	{
		
	}
//	default int  samefuninin() same function can not be defined in same interface class with also diffrentiating by return type also.
//	{
//		
//	}
}
//final interface TestInterface1()
//default interface TestInterface1()
 

abstract class testabstract implements TestInterface1
{
	void afun1()
	{
		
	}
	void samefuninab()
	{
		
	}
//	int samefuninab()		same function can not be defined in same abstract class with also diffrentiating by return type also.
//	{
//		
//	}
}
class TestClass extends testabstract
{ 
	public void ifun1()
	{
		
	}
	void testfun1()
	{
		
	}
	void samefunintest()
	{
		
	}
//	int samefunintest()			same function can not be defined in same class with also diffrentiating by return type also.
//	{
//		return 5;
//	}

	
}
/*illegal modifier for the class ; only public abstract & final are permitted

Error Type 

Compile Time

Sample Code 

public static class Test extends ParentTest {
 private String element = "Hello";

 private String getString(){
  return element;
 }
}

Cause

We cannot have any other modifier for top level class other than public , abstract and final. Class cannot be static. 

Resolution

Remove static 

public class Test extends ParentTest {
 private String element = "Hello";

 private String getString(){
  return element;
 }
}
*/
