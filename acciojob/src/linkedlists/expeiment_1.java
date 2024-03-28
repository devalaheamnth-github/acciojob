package linkedlists;
import java.util.*;
public class expeiment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)//increasing triangle
			{
				System.out.print(" ");
			}
			for(int j =1 ; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(); //incresing triangle
		}
		for(int i =1; i<=n;i++)
		{
			for(int j=i;j<=n;j++)//decreasing triangle
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
