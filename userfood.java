import java.util.*;
import java.io.*;


class User
{
	String name=new String();
	String adrress=new String();
	String id=new String();
	String favourite=new String();
	String preference=new String();
	float avgbud;
	void userData()
	{
			
			name=in.nextLine();
			adrress=in.nextLine();
			id=in.nextLine();
			favourite=in.nextLine();
			preference=in.nextLine();
			avgbud=in.nextFloat();

	}

}

class Food
{
	String id=new String();
	String name=new String();
	String type=new String();
	double cost;
	String place=new String();
	float rating;
	void foodData()
	{
		
			name=in.nextLine();
			id=in.nextLine();
			type=in.nextLine();
			cost=in.nextDouble();
			place=in.nextLine();
			rating=in.nextFloat();

	}

}


public class UserFood{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		User[] user=new User[10];
		Food[] food=new Food[10]; 
		int i;
		for (i=0;i<3;i++)
		 {
			user[i].userData();
			food[i].foodData();	
		 }	

		 for(i=0;i<3;i++)
		 {
		 	System.out.println(user[i].userData());
		 	System.out.println("\n");

		 	System.out.println(food[i].foodData());
		 	System.out.println("\n");


		 }
	
	}
}