import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * Created by benjamindrake on 10/29/15.
 */
public class exercise7 {
    public static void main(String[] args) {
        String [] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};
        //Reverse the Array
        List<String> newNames = Arrays.asList(names);
        Collections.reverse(newNames);


        /*ArrayList<String> newNames2 = new ArrayList<>() ;//alternate method
        for (int i = names.length -1; i >=0; i--) {
            newNames2.add(names[i]);
        }
        System.out.println(newNames2);*/


        //Convert array into a HashMap
        HashMap m = new HashMap();
        for (int i = 0; i < names.length; i +=2) {
            try {
                m.put(names[i], names[i + 1]);
            } catch (Exception e) {

            }
        }
        System.out.println(m);
        //{"Jones":"Charlie", "Brown":"Bob", "Smith":"Alice"}

    }
}
