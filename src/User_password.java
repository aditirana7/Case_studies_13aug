

import java.util.Scanner;

public class User_password {
	public static void main(String args[])
	{
		String user,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		user=sc.nextLine();
		System.out.println("enter Password");
		password=sc.nextLine();
		if (user!="ADITI" && password!="Adi07")
		{
			System.out.println("Successfully logined");
		}
		else if(user!="aditi" && password!="Adi07")
		{
			System.out.println("Successfully logined");
		}
		else
		{
			System.out.println("Wrong credential");
		}
		
		
	}
}
