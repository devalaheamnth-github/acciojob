package trees;
import java.util.*;

public class rec_find_data 
{
	 static ArrayList<Integer> functionn(int num)
	    {
	         ArrayList<Integer> list =new ArrayList<Integer>();
			int count500 = 0;
			int count100 = 0;
			int count50 = 0;
			int count20 = 0;
			int count10 = 0;
			int count5 = 0;
			int count2 = 0;
			int count1 = 0;
			
//			System.out.println("hello");
			
	      while(num>0)
			  {
				  if(num>=500)
				  {
					  System.out.println("hello500" + num);
					  num = num - 500;
					  count500++;
					  list.add(count500);
					  
				  }
				  else if(num>=100)
				  {
					  System.out.println("hello100"+num);
					  num = num - 100;
					  count100++;
					  list.add(count100);
				  }
				  else if(num>=50)
				  {
					  System.out.println("hello50"+num);
					  num = num - 50;
					  count50++;
					  list.add(count50);
				  }
				  else if(num>=20)
				  {
					  System.out.println("hello20"+num);
					  num = num - 20;
					  count20++;
					  list.add(count20);
				  }
				  else if(num>=10)
				  {
					  System.out.println("hello10"+num);
					  num = num - 10;
					  count10++;
					  list.add(count10);
				  }
				  else if(num>=5)
				  {
					  System.out.println("hello5"+num);
					  num = num - 5;
					  count5++;
					  list.add(count5);
				  }
				  else if(num>=2)
				  {
					  System.out.println("hello2"+num);
					  num = num - 2;
					  count2++;
					  list.add(count2);
				  }
				  else if(num>=1)
				  {
					  System.out.println("hello1"+num);
					  num = num - 1;
					  count1++;
					  list.add(count1);
				  }
			  }
	      System.out.println("finshed");
			  return list;
	        
	    }
	
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		System.out.println("yes");
		ArrayList<Integer> ans = functionn(688);
		System.out.println(ans.size());

		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
		
	}

}
