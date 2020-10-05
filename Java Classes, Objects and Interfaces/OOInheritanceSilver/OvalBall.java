public class OvalBall extends Ball {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  private double secondDiameter;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public void setSecondDiameter(double secondDiameter) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    this.secondDiameter = secondDiameter;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public double getSecondDiameter() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    return this.secondDiameter;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public double bounce() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    if (Math.random() > 0.5) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
      return this.getDiameter() * 2;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    } else {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
      return this.getSecondDiameter() * 2;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}