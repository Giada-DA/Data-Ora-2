import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter f1 =DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
        System.out.println(date.format(f1));

        ZonedDateTime zona = ZonedDateTime.now();
        System.out.println(zona);
;
    }
}
