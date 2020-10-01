public class AccountTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String[] args) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Account Acc1 = new Account();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        System.out.println(Acc1.getBalance());	 	         	 	 	      	       	         	
        Acc1.deposit(10.00);	 	         	 	 	      	       	         	
        System.out.println(Acc1.getBalance());	 	         	 	 	      	       	         	
        Acc1.withdraw(15.00);	 	         	 	 	      	       	         	
        System.out.println(Acc1.getBalance());	 	         	 	 	      	       	         	
        Acc1.withdraw(15.00);	 	         	 	 	      	       	         	
        System.out.println(Acc1.getBalance());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}