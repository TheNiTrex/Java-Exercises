public class OverdraftAccount extends Account {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private double currentBalance;	 	         	 	 	      	       	         	
    private double overdraft;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Define Constructor:	 	         	 	 	      	       	         	
    public OverdraftAccount(double overdraft) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentBalance = 10.00;	 	         	 	 	      	       	         	
        this.overdraft = -overdraft;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    @Override // Declare to the Compiler that this is a Method Override	 	         	 	 	      	       	         	
    public double getBalance() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.currentBalance;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
    @Override // Declare to the Compiler that this is a Method Override	 	         	 	 	      	       	         	
    public void deposit(double depoMoney) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentBalance += depoMoney;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    @Override // Declare to the Compiler that this is a Method Override	 	         	 	 	      	       	         	
    public void withdraw(double withMoney) {	 	         	 	 	      	       	         	
        if ((super.getBalance() - withMoney) < this.overdraft) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Error - insufficient funds");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }  else {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentBalance -= withMoney;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}