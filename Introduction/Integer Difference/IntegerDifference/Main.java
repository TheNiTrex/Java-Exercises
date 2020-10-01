public class Main	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  public static void main(String[] args)	 	         	 	 	      	       	         	
  {	 	         	 	 	      	       	         	
    //                 0 1 2 3 4 5  6	 	         	 	 	      	       	         	
    int[] firstTest = {1,1,5,6,9,16,27};	 	         	 	 	      	       	         	
    System.out.println(Challenge.intDiff(firstTest,4));	 	         	 	 	      	       	         	
    // answer is 3:	 	         	 	 	      	       	         	
    // two occurrences of 1 and 5 (at indexes 0 and 2,	 	         	 	 	      	       	         	
    // and 1 and two)	 	         	 	 	      	       	         	
    // one occurrence of 5 and 9 (at index 2 and 4)	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    //                  0 1 2 3	 	         	 	 	      	       	         	
    int[] secondTest = {1,1,3,3};	 	         	 	 	      	       	         	
    Challenge.intDiff(secondTest,2);	 	         	 	 	      	       	         	
    // answer is 4 - 1 and 3 repeated four times, i.e.	 	         	 	 	      	       	         	
    // at position indexes 0 and 2, 0 and 3, 1 and 2,	 	         	 	 	      	       	         	
    // and 1 and 3	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}