package oops;

import java.util.*;

public class starsAndHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String s =sc.next();
		
		int stars = 0;
		int hashs=0 ; 
		
		for(int i=0;i<s.length();i++)
		{
			char character = s.charAt(i);
			
			if(character == '*')
			{
				stars++;
			}
			else
			{
				hashs++;
			}
			
			if(i==s.length()-1)
			{
				if(stars > hashs)
				{
					System.out.println(4);
				}
				else if( hashs > stars)
				{
					System.out.println( -4);
				}
				else {
					System.out.println(0);
				}
			}
		}
		
		
		
	}

}
