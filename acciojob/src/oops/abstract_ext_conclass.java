package oops;

public class abstract_ext_conclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		parent p=new parent();
		System.out.println(0);
		p.parentfunction();
		
		System.out.println(1);
		subclass s= new subclass();
		System.out.println(2);
		s.absfun1();
		s.absfun2();
		System.out.println(3);
		
		abtract a= new subclass();
		System.out.println(4);
		a.absfun1();
		a.absfun2();
		System.out.println(5);
		
		subclass s2= new subclass();
		s2.parentfunction();
		System.out.println(6);
		
		abtract a1= new subclass();
		System.out.println(7);
		a1.parentfunction();
		System.out.println(8);
		
	}
	}


class parent
{
	void parentfunction()
	{
		System.out.println("in parent funtion");
	}
}
abstract class abtract extends parent
{
	void absfun0()
	{
		System.out.println("in absfun0");
	}
	abtract()
	{
		System.out.println("in abstract constructor");
	}
	abtract(int n)
	{
		System.out.println("in parametrized abstract constructor");
	}

	abstract void absfun2();
	{
		System.out.println("in class fun2");
	}
	abstract void absfun1();
	{
		System.out.println("in class fun1");
	}
	abstract void absfun3(int k);
	{
		System.out.println("in class fun3 with int");
	}
//	void parentfunction()
//	{
//		System.out.println("in abtract parent funtion");
//	}
	
	
}
class subclass extends abtract
{
	subclass()
	{
		this(6);
		System.out.println("inside the sub class constructor");
	}
	subclass(int n)
	{
//		this();
		System.out.println("inside this parametrized constructor");
	}
	void funsubclass()
	{
		System.out.println("subclass");
	}
	void absfun1()
	{
		System.out.println("in subclass fun1");
	}
	void absfun2()
	{
		System.out.println("in subclass fun2");
	}
	void absfun3(int k)
	{
		System.out.println("in subclass fun3");
	}
//	void parentfunction()
//	{
//		System.out.println("in sub parent funtion");
//	}
	
}
