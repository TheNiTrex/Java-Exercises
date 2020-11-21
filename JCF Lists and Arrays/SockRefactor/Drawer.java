import java.util.ArrayList;	 	         	 	 	      	       	         	
public class Drawer {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private Sock firstsock = null;	 	         	 	 	      	       	         	
    private Sock secondsock = null;	 	         	 	 	      	       	         	
    private Sock thirdsock = null;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private ArrayList<Sock> Socks = new ArrayList<Sock>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Sock getSock(int sockno) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return Socks.get(sockno - 1);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void addSock(Sock newsock) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Socks.add(newsock);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public boolean hasPair() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        boolean pairFound = false;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < Socks.size(); i++) {	 	         	 	 	      	       	         	
            for (int j = 0; j < Socks.size(); j++) {	 	         	 	 	      	       	         	
                if (Socks.get(i).isPair(Socks.get(j)) && i != j) {	 	         	 	 	      	       	         	
                    pairFound = true;	 	         	 	 	      	       	         	
                    break;	 	         	 	 	      	       	         	
                }	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return pairFound;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}