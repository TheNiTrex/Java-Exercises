public class CustomerTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String[] args) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Customer fred = new Customer("Fred James Smith","39 Woolstaplers Way, Southwark Park Road, Bermondsey, SE16 1JP");	 	         	 	 	      	       	         	
        System.out.println(fred.getFamilyName()); // should be Smith	 	         	 	 	      	       	         	
        System.out.println(fred.getGivenName(1)); // should be Fred	 	         	 	 	      	       	         	
        System.out.println(fred.getGivenName(2)); // should be James	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(1)); // should be 39 Woolstaplers Way	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(2)); // should be Southwark Park Road	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(3)); // should be Bermondsey	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(4)); // should be SE16 1JP	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Customer queenie = new Customer("The Queen","Buckingham Palace, England");	 	         	 	 	      	       	         	
        System.out.println(queenie.getFamilyName()); // should be Queen	 	         	 	 	      	       	         	
        System.out.println(queenie.getGivenName(1)); // should be The	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(1)); // should be Buckingham Palace	 	         	 	 	      	       	         	
        System.out.println(fred.getAddressLine(2)); // should be England	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}