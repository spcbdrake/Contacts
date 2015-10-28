import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by benjamindrake on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie", "david", "allen", "barbie", "colin", "dan"));
        //Take the first 5(in one command)
        ArrayList<String> newNames = new ArrayList(names.subList(0, 5));
        //Make every String inside uppercase
        ArrayList<String> tempNames = new ArrayList();
        for (String name : newNames) {
            tempNames.add(name.toUpperCase());
        }
        newNames = tempNames;

        /* Alternate method

        for (int i = 0; i < names.size(); i ++) {
            String s = names.get(i).toUpperCase();
            names.set(i, s);
        }
        */
        //Remove the ones that start with A
        Iterator<String> it = newNames.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("A")) {
                it.remove();
            }
        }

        System.out.println(newNames);

    }
}
