package Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	  System.out.println("Enter a year:");
       Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
      
       if(a%4==0 && a!=100 || a%400==0) {
    	   System.out.println("Leap Year");
       }
       else
       {
    	   System.out.println("Not Leap Year");
       }
	}

}
