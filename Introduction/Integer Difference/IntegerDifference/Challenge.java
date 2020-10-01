public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static int intDiff(int arr[], int diff) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int occurances = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < arr.length; i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            for (int j = 0; j < arr.length; j++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                if ((arr[j] - arr[i]) == diff)	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                    occurances += 1;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return occurances;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}