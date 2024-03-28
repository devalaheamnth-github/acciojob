package oops;

public class practice
{

	public static void main(String[] args)
	{
		c obj = new c();
//		System.out.println();

	}

}
class a
{
	int a;
	void print()
	{
		System.out.println(a);
	}
	a()
	{
	a=50;
	System.out.println("a's constructor");
	}
}
class b extends a
{
	
	int a;
	b(int i)
	{
		this();
		this.a=i;
	}
	
	void fun()
	{
		print();
	}
	b()
	{
	this.a=100;
	System.out.println("b's constructor");
	}
}
class c extends b
{
	
	int a;
	c(){
		super.fun();
	this.a=150;
	System.out.println("c's constructor");
	}
}
