import java.util.Scanner;	 	         	 	 	      	       	         	
public class TestMaths	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  public static void main(String[] args)	 	         	 	 	      	       	         	
  {	 	         	 	 	      	       	         	
   Scanner myScan = new Scanner(System.in);	 	         	 	 	      	       	         	
   int x = 0;	 	         	 	 	      	       	         	
   int y = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
   System.out.println("Type your first integer");	 	         	 	 	      	       	         	
   x = myScan.nextInt();	 	         	 	 	      	       	         	
   System.out.println("Type your next integer");	 	         	 	 	      	       	         	
   y = myScan.nextInt();	 	         	 	 	      	       	         	
   System.out.println(Maths.max(x, y) + " Is greatest");	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}