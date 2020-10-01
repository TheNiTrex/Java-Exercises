public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static String reverseWords(String original) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String reversedSentence = "";	 	         	 	 	      	       	         	
        String word = "";	 	         	 	 	      	       	         	
        String[] splitOriginal = original.split(" ");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < splitOriginal.length; i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            char[] characterArray = splitOriginal[i].toCharArray();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            String reversedWord = "";	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            for (int j = characterArray.length - 1; j >= 0 ; j--) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                reversedWord += characterArray[j];	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            reversedSentence += (" " + reversedWord);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        reversedSentence = reversedSentence.trim();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return reversedSentence;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}