import java.util.List;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static Integer[] listToArray(List<Integer> list) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int listSize = list.size();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Integer[] array = new Integer[listSize];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < listSize; i++) array[i] = list.get(i);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return array;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}