import java.util.Date;
import java.time.LocalTime;
public class date {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Date date = new Date();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
