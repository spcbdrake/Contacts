/**
 * Created by benjamindrake on 10/7/15.
 */
public class Contact implements Comparable {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact(){

    }

    public Contact (String name, int age) {
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        int result = name.compareTo(c.name);
        if (result == 0) {
            return age - c.age;
        } else {
            return result
        }
    }
}