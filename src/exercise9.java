import java.util.ArrayList;

/**
 * Created by benjamindrake on 11/4/15.
 */
public class exercise9 {
    public static void main(String[] args) {
        String[] names  = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortednames= new ArrayList();
        //compareTo
        for (String name : names) {
            int index = 0;
            for (String sortedName : sortednames){
                if (name.compareTo(sortedName) > 0){
                    index++;
                } else {
                    break;
                }
            }
            sortednames.add(index, name);
        }
        System.out.println(sortednames);
    }
}
