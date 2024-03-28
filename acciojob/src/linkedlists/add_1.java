package linkedlists;

import java.util.*;
import java.lang.*;
import java.io.*;
public class add_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=(int)Math.log10(n)+1;
        int arr[]=new  int[size];
        int index=arr.length-1;
        
        while(n!=0)
                {
                        int r=n%10;
                        arr[index]=r;
                        n=n/10;
                        index--;
                }
        linkedlist l1=new linkedlist();
         
        for(int i=0;i<n;i++)
                {
                        if(i==n-1)
                        {
                                arr[i]=arr[i]+1;
                        }
                        l1.insert(arr[i]);         
                }
        l1.print();
        // System.out.println(size);
	}

}
class node
{
int val;
node next;
node(int val)
        {
                this.val=val;
        }
}

class linkedlist
{
        node head;
        void insert(int val)
        {
                node n= new node(val);
                if(this.head==null)
                {
                        this.head=n;
                        return;
                }
                node temp=this.head;
                while(temp.next!=null)
                        {
                                temp=temp.next;
                        }
                temp.next=n;  
        }
        void print()
        {
                node temp=this.head;
                while(temp!=null)
                        {
                                
                                System.out.print(temp.val+" ");
                                temp=temp.next;
                        }
        }
}
