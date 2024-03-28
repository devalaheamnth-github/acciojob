package oops;

public class sumUsingRecursive {
	
	public static int findingSumUsingRecursive( int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		return 		findingSumUsingRecursive(n-1) + 		findingSumUsingRecursive(n-1); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(		findingSumUsingRecursive(5)  );

	}

}
