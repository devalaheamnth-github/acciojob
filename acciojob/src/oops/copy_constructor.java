package oops;

public class copy_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
////Create a constructor that accepts an object of the same class as a parameter.
//class Fruits  
//{   
//private double price;   
//private String name;   
////copy constructor  
//public Fruits(Fruits fruits)   
//{   
////getters  
//}   
//}  
//Copy each field (variable) object into the newly created instanc/
class Fruits  
{   
private double price;   
private String name;   
//copy constructor  
public Fruits(Fruits fruits)   
{  
//copying each filed   
this.price = fruits.price; //getter  
this.name = fruits.name; //getter  
}   
}  