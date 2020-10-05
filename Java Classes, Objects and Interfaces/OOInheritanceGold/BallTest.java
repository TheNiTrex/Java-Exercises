public class BallTest {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public static void main(String args[]) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Test Ball Object:	 	         	 	 	      	       	         	
    Ball b1 = new Ball();	 	         	 	 	      	       	         	
    System.out.println(b1.bounce());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    // Test OvalBall Object, an extention of the Ball Class:	 	         	 	 	      	       	         	
    OvalBall rugbyBall = new OvalBall();	 	         	 	 	      	       	         	
    rugbyBall.setDiameter(27);	 	         	 	 	      	       	         	
    rugbyBall.setSecondDiameter(19);	 	         	 	 	      	       	         	
    System.out.println("Our rugby ball bounces " + rugbyBall.bounce() + " high");	 	         	 	 	      	       	         	
    rugbyBall.roll();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}