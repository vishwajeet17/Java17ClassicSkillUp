
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dateAndTimeStreams {
    public static void main(String[] args) {
        // 1. Generating Date-Time Values with Streams
        LocalDate startDate = LocalDate.of(2024, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2024, Month.JANUARY, 10);

        Stream<LocalDate> dateStream = startDate.datesUntil(endDate);
        System.out.println("Generated Dates:");
        dateStream.forEach(System.out::println);

        // 2. Filtering Date-Time Values
        List<LocalDateTime> dateTimeList = Arrays.asList(
                LocalDateTime.of(2024, Month.JANUARY, 1, 10, 0),
                LocalDateTime.of(2024, Month.JANUARY, 2, 11, 0),
                LocalDateTime.of(2024, Month.JANUARY, 3, 12, 0));

        LocalDate filterDate = LocalDate.of(2024, Month.JANUARY, 2);
        List<LocalDateTime> filteredList = dateTimeList.stream()
                .filter(dt -> dt.toLocalDate().isAfter(filterDate))
                .collect(Collectors.toList());
        System.out.println("Filtered Date-Times:");
        filteredList.forEach(System.out::println);

        // 3. Mapping Date-Time Values
        List<LocalDate> dateList = dateTimeList.stream()
                .map(LocalDateTime::toLocalDate)
                .collect(Collectors.toList());
        System.out.println("Mapped Dates:");
        dateList.forEach(System.out::println);

        // 4. Reducing Date-Time Values
        LocalDate maxDate = dateList.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);
        System.out.println("Maximum Date: " + maxDate);
    }
}
