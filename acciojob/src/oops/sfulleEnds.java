package oops;

public class sfulleEnds {
	public static String sfulleEnds(String str)
	{
		  if(str.length() == 1)
		  {
		    return str;
		  }
		  
		  char starting = str.charAt(0);
		  char ending = str.charAt(str.length()-1);
		  
		  if(str.length() == 2)
		  {
		    return ending+""+starting;
		  }
		  
		  return ending+str.substring(1,str.length()-1)+starting;
	}

	public static void main(String[] args) {
		
			  System.out.println( sfulleEnds("code") );
			  System.out.println( sfulleEnds("a") );
			  System.out.println( sfulleEnds("ab") );
		
//			String str = "code";		
//			char starting = str.charAt(0);
//			char ending = str.charAt(str.length()-1);
//			
//			System.out.println(ending + starting);

	}

}
