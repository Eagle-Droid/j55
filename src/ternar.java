import java.time.LocalDateTime;
import java.time.LocalTime;

public class ternar {
    public static void main(String[] args) {
        int ora= LocalDateTime.now().getHour();
        int min= LocalDateTime.now().getMinute();
        String perioada= ora >= 12 ? "PM" : "AM";
        System.out.println(ora+ ":"+ min);
        System.out.println(perioada);
    }
}
