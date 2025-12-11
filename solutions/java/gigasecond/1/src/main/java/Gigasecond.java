import java.time.LocalDate;
import java.time.LocalDateTime;

//giga = 10^9 
public class Gigasecond {
    private final LocalDateTime localDateTime;
    public Gigasecond(LocalDate moment) {
        LocalDateTime ldt = moment.atStartOfDay();

        this.localDateTime = ldt.plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.localDateTime = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return this.localDateTime;
    }
}
