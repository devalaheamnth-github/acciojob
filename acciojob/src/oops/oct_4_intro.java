package oops;

public class oct_4_intro {

	public static void main(String[] args)
	{
		Studentt s1=new Studentt();
//		s1.i=5;										/*first checks here for s1.s or s1.i  */
//		s1.s="default string";
		System.out.println(s1.i+"\n"+s1.s);
		Studentt s2=new Studentt(1,"hemanth2");
		
		System.out.println(s2.i+" "+s2.s);
	}

}
class Studentt
{
	int i=1111;										/*third checks here s1.s or s1.i*/
	String s="string s";
	Studentt()
	{
//		i=0;										/*second checks here s1.s or s1.i */
//		s="default string in constructor";
		System.out.println("default constructor");
	}
	Studentt(int integer,String str)
	{
		System.out.println("parametized constructor");
	}
	
}
