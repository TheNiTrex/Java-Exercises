public class Main	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  public static void main(String[] args)	 	         	 	 	      	       	         	
  {	 	         	 	 	      	       	         	
     System.out.println(Challenge.killDupes("this is a test"));	 	         	 	 	      	       	         	
     // the capitalised letters are duplicated:	 	         	 	 	      	       	         	
     // this IS a TeST	 	         	 	 	      	       	         	
     // Spaces are also duplicated after the first one.	 	         	 	 	      	       	         	
     // Thus, the final output will be 'this ae'	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
     System.out.println(Challenge.killDupes("Paul is awesome"));	 	         	 	 	      	       	         	
     // Paul isweom	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
     System.out.println(Challenge.killDupes("Java Programming"));	 	         	 	 	      	       	         	
     // Java Progmin	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
     System.out.println(Challenge.killDupes("I am an idiot"));	 	         	 	 	      	       	         	
    // I amndot	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}