package Programs;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int base=Integer.parseInt(args[0]);
         int expo=Integer.parseInt(args[1]);
         
         for(int i=0; i<expo; i++)
         {
        	 base=base*expo;
        	
         }
         System.out.println(base);
	}

}
