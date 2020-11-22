import java.io.File;	 	         	 	 	      	       	         	
import java.io.IOException;	 	         	 	 	      	       	         	
import java.io.FileWriter;	 	         	 	 	      	       	         	
import java.io.FileNotFoundException;	 	         	 	 	      	       	         	
public class Challenge {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void writeFile() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        try {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            File myFile = new File("myfiles/japi-io/writefile.txt");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            if (myFile.createNewFile()) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                System.out.println("File " + myFile.getName() +" has been created");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            } else System.out.println("This file already exists");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            WriteToFile(myFile);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } catch(IOException e) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Something went wrong");	 	         	 	 	      	       	         	
            e.printStackTrace();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void WriteToFile(File file) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        String fileName = file.getName();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        try {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            FileWriter myFileWriter = new FileWriter("myfiles/japi-io/" + fileName);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            String lineSeparator = System.lineSeparator();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            myFileWriter.write("Hello there." + lineSeparator + "This is a file I made.");	 	         	 	 	      	       	         	
            myFileWriter.close();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Wrote to " + fileName);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } catch(IOException e) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("Something went wrong");	 	         	 	 	      	       	         	
            e.printStackTrace();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public static void readFile() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        try {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            Scanner myScanner = new Scanner(new File("myfiles/japi-io/writefile.txt"));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            while (myScanner.hasNextLine()) System.out.println(myScanner.nextLine());	 	         	 	 	      	       	         	
            myScanner.close();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        } catch (FileNotFoundException e) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println("File not found");	 	         	 	 	      	       	         	
            e.printStackTrace();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}