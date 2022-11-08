import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args){
        LocalTime obj = LocalTime.now();
        System.out.println(obj);
        String l = String.valueOf(obj);
        System.out.println(l);

    }
}
