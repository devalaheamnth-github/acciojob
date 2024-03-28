package oops;

import java.util.Scanner;

public class pushItEnd {
	public static void printArray(int arr[])
	{
		int index = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=0)
			{
				int temp = arr[index] ;
				arr[index] = arr[i];
				arr[i] = temp;
		
				index++;
				
			}
		}
		
//		for(int i = index ; i<arr.length;i++)
//		{
//			arr[i] = 0;
//		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	// 0 0 4 2 7 0 5 0 0 6  7   0   0   9  0 ---> 4 2 7 5 6 7 9 0 0 0 0 0 0 0 
	// 0 1 2 3 4 5 6 7 8 9 10  11  12  13  14
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		printArray(arr);
	}

}
