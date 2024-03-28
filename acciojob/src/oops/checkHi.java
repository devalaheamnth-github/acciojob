package oops;

public class checkHi {
	
	public static boolean startHi(String str) {
		  if(str.length()>=2 && str.substring(0,2).equals("hi") )
		  {
		    return true;
		  }
		  
		  return false;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp = "hi there";
		
		
		
		System.out.println( exp.substring(0,2)== "hi" );

	}

}
