public class AccountTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void main(String[] args) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        OverdraftAccount OverAcc1 = new OverdraftAccount(200);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        System.out.println(OverAcc1.getBalance());	 	         	 	 	      	       	         	
        OverAcc1.deposit(20.00);	 	         	 	 	      	       	         	
        System.out.println(OverAcc1.getBalance());	 	         	 	 	      	       	         	
        OverAcc1.withdraw(50.00);	 	         	 	 	      	       	         	
        System.out.println(OverAcc1.getBalance());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}