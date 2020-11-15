import java.util.Set;	 	         	 	 	      	       	         	
import java.util.HashSet;	 	         	 	 	      	       	         	
import java.util.List;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static Set<Integer> listToSet(List<Integer> list) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int listSize = list.size();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Set<Integer> set = new HashSet<Integer>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (Integer i : list) set.add(i);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return set;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}