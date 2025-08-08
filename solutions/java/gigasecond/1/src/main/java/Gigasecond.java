import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        // Convert the LocalDate to LocalDateTime (midnight) and add one gigasecond
        this.moment = moment.atStartOfDay().plus(1_000_000_000, ChronoUnit.SECONDS);
    }

    public Gigasecond(LocalDateTime moment) {
        // Add one gigasecond to the given moment
        this.moment = moment.plus(1_000_000_000, ChronoUnit.SECONDS);
    }

    public LocalDateTime getDateTime() {
        return moment;
    }
}