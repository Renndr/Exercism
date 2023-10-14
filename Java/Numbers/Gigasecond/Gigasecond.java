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


    public static void main(String[] args) {
        // Create a LocalDate or LocalDateTime object representing the input moment
        LocalDate inputDate = LocalDate.of(2023, 9, 2);
        LocalDateTime inputDateTime = LocalDateTime.of(2015, 1, 24, 22, 00, 0);
        // January 24th, 2015 at 22:00 (10:00:00pm)
    
        // Create instances of Gigasecond and pass the input moment
        Gigasecond gigasecondFromDate = new Gigasecond(inputDate);
        Gigasecond gigasecondFromDateTime = new Gigasecond(inputDateTime);
    
        // Get the moments that are one gigasecond in the future
        LocalDateTime resultFromDate = gigasecondFromDate.getDateTime();
        LocalDateTime resultFromDateTime = gigasecondFromDateTime.getDateTime();
    
        // Print the results
        System.out.println("Input Date: " + inputDate);
        System.out.println("Result Date: " + resultFromDate);
        System.out.println("Input Date-Time: " + inputDateTime);
        System.out.println("Result Date-Time: " + resultFromDateTime);
    }
}