public class Account {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private double currentBalance;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Account() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentBalance = 10.00;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public double getBalance() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.currentBalance;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void deposit(double depoMoney) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentBalance += depoMoney;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void withdraw(double withMoney) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        if ((this.currentBalance - withMoney) < 0) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Error - insufficient funds");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }  else {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentBalance -= withMoney;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}