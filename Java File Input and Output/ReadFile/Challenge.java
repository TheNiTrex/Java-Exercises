import java.io.File;	 	         	 	 	      	       	         	
import java.io.FileNotFoundException;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void readFile() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        try {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            Scanner myScanner = new Scanner(new File("myfiles/japi-io/readfile.txt"));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            while (myScanner.hasNextLine()) System.out.println(myScanner.nextLine());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            myScanner.close();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } catch (FileNotFoundException e) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("File not found");	 	         	 	 	      	       	         	
            e.printStackTrace();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}