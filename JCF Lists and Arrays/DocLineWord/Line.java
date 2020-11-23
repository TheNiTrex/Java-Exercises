import java.util.ArrayList;	 	         	 	 	      	       	         	
import java.util.Arrays;	 	         	 	 	      	       	         	
public class Line {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    private ArrayList<Word> words = new ArrayList<Word>();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Line(String content) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        for (String word : content.split(" ")) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
            Word newWord  = new Word(word);	 	         	 	 	      	       	         	
            this.words.add(newWord);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Line(Word[] content) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.words.addAll(Arrays.asList(content));	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public void addWord(Word word) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        this.words.add(word);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public Word getWord(int index) {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.words.get(index - 1);	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    public int getNumberOfWords() {	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
        return this.words.size();	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
    }	 	         	 	 	      	       	         	
	 	         	 	 	      	       	         	
}