package oops;

public class classes_vs_interfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj = new c();

	}

}
interface define
{
	void iffun1();
	
}
abstract class abtract implements define
{
	void abmet1()
	{
		
	}
	abstract void  abfun1();
}
class c extends abtract implements define
{
	public void iffun1()
	{
		System.out.println("interface fun in c");
	}
	void abfun1()
	{
		
	}
	void cfun1()
	{
		
	}
	
}