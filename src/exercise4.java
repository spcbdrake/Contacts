import java.util.HashMap;

/**
 * Created by benjamindrake on 10/26/15.
 */
public class exercise4 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question";
        HashMap <String, Integer> frequencies = new HashMap<>();
        String [] words = sentence.split(" ");
        for (String word : words) {
            String cleanedWord = word.toLowerCase().replace(",", "");
            if (frequencies.get(cleanedWord) == null) {
                frequencies.put(cleanedWord), 1;
            }
            else {
                int count = frequencies.get(cleanedWord);
                frequencies.put(cleanedWord, count + 1);
            }
        }
        System.out.println(frequencies);

    }
}
