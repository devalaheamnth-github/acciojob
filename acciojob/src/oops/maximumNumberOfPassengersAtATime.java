package oops;

import java.util.Scanner;

public class maximumNumberOfPassengersAtATime {
	
	public static void printMaxAtAInstance(int e[] , int l[] , int n )
	{
		int maxPassengersAtAGivenInstance = Integer.MIN_VALUE;
		
		int noOfPassengers = 0;
		
		for(int i=0; i<n ; i++)
		{
			noOfPassengers = noOfPassengers + e[i] - l[i];
			
			if(noOfPassengers > maxPassengersAtAGivenInstance)
			{
				maxPassengersAtAGivenInstance = noOfPassengers ; 
			}
		}
		
		System.out.println(maxPassengersAtAGivenInstance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		int e[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			e[i] = sc.nextInt();
		}
		
		int l[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			l[i] = sc.nextInt();
		}
		
		printMaxAtAInstance(e , l , n);
		

	}

}
