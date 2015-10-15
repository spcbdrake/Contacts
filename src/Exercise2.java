import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by benjamindrake on 10/15/15.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //sayHello(scanner);
        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
            String firstLetter = name.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if(list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            } else{
                list.add(name);
            }
        }
        System.out.println(groups);
    }

    static void sayHello (Scanner scanner) {
        String input;
        System.out.println("What would you like to input?");
        input = scanner.nextLine();

        while (input != "hello") {
            System.out.println("You should say hello first...");
            input = scanner.nextLine();
            if (input.equals("hello")) {
                System.out.println("Ello guvna!");
                System.exit(0);
            } else {
            }
        }
    }

}
