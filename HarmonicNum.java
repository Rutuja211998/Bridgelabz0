package Programs;
import java.util.Scanner;
public class HarmonicNum {
	public static void main(String[] args) {
		float h=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		float N=sc.nextInt();
		for(int i=2;i<N;i++) 
		{
			h+=(float)1/i;
		}
		System.out.println(h);
	}
}
		// TODO Auto-generated method stub
//       static double nthHarmonic(int N)
//       {
//    	   float harmonic=1;
//    	   for(int i=2; i<N; i++)
//    	   {
//    		   harmonic +=(float)1/i;
//    
//    	   }
//    	   return harmonic;
//       }
//      public static void main (String []args)
//      {
//    	  int N=5;
//    	  System.out.println(nthHarmonic(N));
//      }
//	}


