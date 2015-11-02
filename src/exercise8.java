import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by benjamindrake on 11/2/15.
 */
public class exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //Split line into an array of columns
            String[] columns = line.split(",");
            // add first and last name to "names"
            names.add(columns [1] + " " + columns [2]);
        }
        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList();
        //Fill up "results" with all the names that contain searchTerm (case-insensitive)
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())){
                results.add(name);
            }
        }

        System.out.println(results);
    }
}
