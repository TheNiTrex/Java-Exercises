public class SimCard {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private int currentMinutes;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public SimCard() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentMinutes = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void buyMinutes(int pounds) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        if (pounds >= 25) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentMinutes += (pounds * 192);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } else if (pounds <= 25 && pounds > 19) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentMinutes += (pounds * 120);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } else if (pounds < 20 && pounds > 14) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentMinutes += (pounds * 80);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } else if (pounds < 15 && pounds > 9) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            this.currentMinutes += (pounds * 60);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } else if (pounds < 10) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Error - minimum value is 10 pounds");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        System.out.println(this.currentMinutes);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getMinutes() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.currentMinutes;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void makeCall(int minutes) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.currentMinutes = (this.currentMinutes - minutes) < 0 ? 0 : (this.currentMinutes -= minutes);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        System.out.println(this.currentMinutes);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}