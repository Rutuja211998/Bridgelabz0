package Programs;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int k,a=1,b=1;
      int k1=0;
      System.out.print("1 1");
      while(k1<=20)
      {
    	  k1=a+b;
    	  a=b;
    	  b=k1;
    	  System.out.print(" " + k1);
      }
	}

}
