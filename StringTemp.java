package Programs;

import java.util.Scanner;

public class StringTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		int len=name.length();
		if(len>=3)
		{
			System.out.println("Hello," +name+ " How are you?");
		}
		else
		{
			System.out.println("Size should be greater than 3");
		}
	}
}
