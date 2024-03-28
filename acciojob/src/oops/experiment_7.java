package oops;

public class experiment_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			bbass obj=new bbass();
//			bbass obj1=new bbass(6);

	}

}
//java creates automatically constructors when not defined.but we explicitly define any constructor in method, then we should defenately 
//define non parametrized constructor;
class abass
{
	abass()
	{
		System.out.println("abass constructor");
	}
	abass(int k)
	{
		System.out.println("abass par constructor");
	}
}
class bbass extends abass
{
//	bbass() //Implicit super constructor abass() is undefined. Must explicitly invoke another constructor
//	{
//		super();
//		System.out.println("bbass constructor");
//	}
	bbass(int k)//Implicit super constructor abass() is undefined. Must explicitly invoke another constructor
	{
		System.out.println("bbass par constructor");
	}
}
















