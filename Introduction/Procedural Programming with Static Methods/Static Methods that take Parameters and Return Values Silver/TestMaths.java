import java.util.Scanner;	 	         	 	 	      	       	         	
public class TestMaths	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  public static void main(String[] args)	 	         	 	 	      	       	         	
  {	 	         	 	 	      	       	         	
   Scanner myScan = new Scanner(System.in);	 	         	 	 	      	       	         	
   int v = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
   System.out.println("Type in an integer");	 	         	 	 	      	       	         	
   v = myScan.nextInt();	 	         	 	 	      	       	         	
   System.out.println("The absolute value of "+v+" is "+Maths.abs(v));	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}