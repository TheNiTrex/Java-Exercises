import java.util.List;	 	         	 	 	      	       	         	
import java.util.ArrayList;	 	         	 	 	      	       	         	
import java.util.Set;	 	         	 	 	      	       	         	
public class Main	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
public static void main(String[] args){	 	         	 	 	      	       	         	
 List<Integer> input = new ArrayList<Integer>();	 	         	 	 	      	       	         	
            input.add(1);	 	         	 	 	      	       	         	
            input.add(1);	 	         	 	 	      	       	         	
            input.add(2);	 	         	 	 	      	       	         	
            input.add(2);	 	         	 	 	      	       	         	
            input.add(3);	 	         	 	 	      	       	         	
            input.add(4);	 	         	 	 	      	       	         	
            input.add(4);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    Set<Integer> output = Challenge.listToSet(input);	 	         	 	 	      	       	         	
    System.out.println(output.size());	 	         	 	 	      	       	         	
    for (Integer i: output){	 	         	 	 	      	       	         	
        System.out.println(i);	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // expected output	 	         	 	 	      	       	         	
    // the first 4 is the size of the array	 	         	 	 	      	       	         	
    // the order of the 4 elements (1,2,3,4) is not important	 	         	 	 	      	       	         	
   // 4	 	         	 	 	      	       	         	
   // 1	 	         	 	 	      	       	         	
  //  2	 	         	 	 	      	       	         	
  //  3	 	         	 	 	      	       	         	
  //  4	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
   }	 	         	 	 	      	       	         	
}