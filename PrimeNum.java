package Programs;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();

		if (isPrime(n)) 
		{
			System.out.println(n+" is a prime number");	
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	public static boolean isPrime(int n) {
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;

	}
}