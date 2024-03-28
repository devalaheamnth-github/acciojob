package oops;

public class blackJack {
	public static int blackjack(int a, int b) {
		  if ( (a%21 >=1 && a%21 <=21) && ( b%21 >=1 && b%21 <=21 ) )
		  {
		    if(21 - a  > 21 - b)
		    {
		      return b;
		    }else{
		      return a;
		    }
		  }
		  
		  else if( (a%21 >=1 && a%21 <=21) && !( b%21 >=1 && b%21 <=21 )   ) 
		  {
		    return a ; 
		  }
		  
		  else if( !(a%21 >=1 && a%21 <=21) && ( b%21 >=1 && b%21 <=21 )   )
		  {
		    return b;
		  }
		  else{
		  
		    return 0 ;
		  }
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
