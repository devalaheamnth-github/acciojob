package oops;


import java.util.*;


public class greaterThanPrevious {
	
	public static void printOutput(int arr[])
	{
		int count = 0;
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				count++;
				
				max = arr[i];
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		printOutput(arr);
		

	}

}
