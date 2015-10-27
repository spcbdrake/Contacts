import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by benjamindrake on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";
        //remove commas and periods
        s= s.replace(",", "").replace(".", "");
        //make it all lowercase
        s= s.toLowerCase();
        //Split into words
        //remove duplicate words
        //Create a new string without the duplicate words

        ArrayList<String> newWords = new ArrayList();
        String [] words = s.split(" "); // splits sentence into words
        for (String word : words) { // remove duplicate words
            if (!newWords.contains(word)) {
                newWords.add(word);
            }

        }
        String newStr = "";// creates new string
        for (String newWord : newWords) {
            if (!newStr.isEmpty()) {
                newStr += " ";
            }
            newStr += newWord;
        }
        System.out.println(newStr);
    }
}
