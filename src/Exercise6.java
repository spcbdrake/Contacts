import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by benjamindrake on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie", "david", "allen", "barbie", "colin", "dan"));
        //Take the first 5(in one command)
        ArrayList<String> newNames = new ArrayList(names.subList(0, 5));

        solveViaStream(newNames);
        solveViaTempLists(newNames);
        solveViaDirectModification(newNames);


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
    }

    static void solveViaDirectModification(ArrayList<String> newNames) {
        for (int i = 0; i < newNames.size(); i++) {
            String s = newNames.get(i).toUpperCase();
            newNames.set(i, s);
        }

        Iterator<String> it = newNames.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(newNames);
    }


    static void solveViaTempLists(ArrayList<String> newNames) {
        //Make every String inside uppercase
        ArrayList<String> tempNames = new ArrayList();
        for (String name : newNames) {
            tempNames.add(name.toUpperCase());
        }
        newNames = tempNames;
        //Remove the ones starting with "A"
        tempNames = new ArrayList();
        for (String name : newNames) {
            if (!name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        newNames = tempNames;
        System.out.println(newNames);
    }

    static void solveViaStream (ArrayList<String> newNames) {
        List<String> newNewNames =
                newNames
                .stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList());

        System.out.println(newNewNames);
    }
}