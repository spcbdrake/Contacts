/**
 * Created by benjamindrake on 10/8/15.
 */
public class Email {
    public String subject;
    public String body;
    public String destination;
    public int timestamp;

    public Email () {
        System.out.println("Creating Email...");
        subject = "No subject";
        body = "";
        destination = "";
        timestamp = 0;
    }

    public Email (String subject, String body, String destination, int timestamp) {
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    public void setSubject (String subject) {
        this.subject = subject;
    }

    public String getSubject () {
        return subject;
    }

    public static boolean isValidSubject(String subject) {
        return subject.length() !=0;
    }

    public void setDestination (String destination) {
         this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

}
