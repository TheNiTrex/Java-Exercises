import java.util.List;	 	         	 	 	      	       	         	
import java.util.ArrayList;	 	         	 	 	      	       	         	
public class Main	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  public static void main(String[] args){	 	         	 	 	      	       	         	
   List<Integer> myList = new ArrayList<Integer>();	 	         	 	 	      	       	         	
            myList.add(1);	 	         	 	 	      	       	         	
            myList.add(2);	 	         	 	 	      	       	         	
            myList.add(3);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    Integer[] arr=Challenge.listToArray(myList);	 	         	 	 	      	       	         	
    for (Integer i: arr){	 	         	 	 	      	       	         	
        System.out.println(i);	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
     // expected output:	 	         	 	 	      	       	         	
    // 1	 	         	 	 	      	       	         	
    // 2	 	         	 	 	      	       	         	
    // 3	 	         	 	 	      	       	         	
   }	 	         	 	 	      	       	         	
}