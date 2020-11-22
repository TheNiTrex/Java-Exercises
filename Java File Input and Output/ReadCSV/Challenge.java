import java.util.List;	 	         	 	 	      	       	         	
import java.util.ArrayList;	 	         	 	 	      	       	         	
import java.io.File;	 	         	 	 	      	       	         	
import java.io.FileNotFoundException;	 	         	 	 	      	       	         	
import static java.lang.Integer.parseInt;	 	         	 	 	      	       	         	
import java.time.format.DateTimeFormatter;	 	         	 	 	      	       	         	
import java.time.LocalDate;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
public class Challenge	 	         	 	 	      	       	         	
{	 	         	 	 	      	       	         	
  private static List<Task> tasks = new ArrayList();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public static void readCSVFile(String filename)	 	         	 	 	      	       	         	
  {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
      ArrayList<String> parsedTask = new ArrayList<String>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
      try {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        Scanner myScanner = new Scanner(new File(filename));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        while (myScanner.hasNextLine()) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            for (String s : myScanner.nextLine().split(",")) parsedTask.add(s);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            tasks.add(new Task(	 	         	 	 	      	       	         	
                    parsedTask.get(0),	 	         	 	 	      	       	         	
                    (parseInt((parsedTask.get(1)))),	 	         	 	 	      	       	         	
                    (LocalDate.parse(parsedTask.get(2)))));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            parsedTask.clear();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
      } catch (FileNotFoundException e) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
          System.out.println("File not found");	 	         	 	 	      	       	         	
          e.printStackTrace();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
      }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public static List<Task> getTasks(){	 	         	 	 	      	       	         	
     return tasks;	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
  public static void setTasks(List<Task> tasks){	 	         	 	 	      	       	         	
     Challenge.tasks = tasks;	 	         	 	 	      	       	         	
  }	 	         	 	 	      	       	         	
}