import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1= LocalDate.of(2002, Month.DECEMBER, 22);
        System.out.println(ld1);
        LocalDate ld2= LocalDate.of(2002, 12, 22);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(17, 18, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);

        LocalDate ld3 = timePoint.toLocalDate();
        System.out.println(ld3);
        System.out.println(timePoint.getMonthValue());
        Month month = timePoint.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());
    }
}
