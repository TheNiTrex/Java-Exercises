import java.util.ArrayList;	 	         	 	 	      	       	         	
public class Document {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private String name;	 	         	 	 	      	       	         	
    private String author;	 	         	 	 	      	       	         	
    private int priority;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private ArrayList<Line> lines = new ArrayList<Line>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setName(String name) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.name = name;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getName() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.name;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setAuthor(String author) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.author = author;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public String getAuthor() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.author;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void setPriority(int priority) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       this.priority = priority;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getPriority() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
       return this.priority;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getNumberOfWords() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        int numOfWords = 0;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (Line line : lines) numOfWords += line.getNumberOfWords();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return numOfWords;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getNumberOfLines() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.lines.size();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void addLine(Line line) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        lines.add(line);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void addWord(Word word) { // Add Word to final Line of the Document	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.lines.get(lines.size() - 1).addWord(word);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void generatePreview() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (int i = 0; i < this.lines.size(); i++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            String currentLine = "";	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            for (int j = 0; j < this.lines.get(i).getNumberOfWords() ; j++) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                Word currentWord = this.lines.get(i).getWord(j + 1);	 	         	 	 	      	       	         	
                String currentWordString = (currentWord.getText());	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                if (currentWord.isBold()) currentWordString = ("*" + currentWordString + "*");	 	         	 	 	      	       	         	
                if (currentWord.isUnderlined()) currentWordString = ("_" + currentWordString + "_");	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
                currentWordString = (currentWordString + " ");	 	         	 	 	      	       	         	
                currentLine += currentWordString;	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            System.out.println(currentLine);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
}