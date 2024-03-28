package linkedlists;

import java.util.Scanner;


public class experiment {
	
	
	static int recursiveMethod(int number , int n)
	{
		int answer = 0;		if(n==0)
		{
			answer = number -1;
			return answer;
		}
		
		int count = 0;
	
		for(int i=1;i<=number;i++)//if it has other factors
		{
			if(number%i==0)
			{
				count++;
			}
		}
		
		if(count!=2)
		{
			answer = recursiveMethod(number+1 , n);
		}else {
			answer = recursiveMethod(number+1 , n-1);//prime_number
		}
		
		return answer;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int ans;
//		if(n==1)
//		{
//			ans =2;
//			System.out.println( ans);
//			return;
//		}

		int number = 3;
		n= n-1;
		int main_answer = recursiveMethod(number , n);
		System.out.println(main_answer);

	}

}
