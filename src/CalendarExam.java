import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Year : "+cal.get(Calendar.YEAR));
        // Month는 +1을 해줘야 현재 월을 표시함.
        System.out.println("Month : "+cal.get(Calendar.MONTH));
        System.out.println("Date : "+cal.get(Calendar.DATE));
        // 24시 기준
        System.out.println("Hour 24 : "+cal.get(Calendar.HOUR_OF_DAY));
        // 오전 오후 기준
        System.out.println("Hour 12 : "+cal.get(Calendar.HOUR));
        System.out.println("Minute : "+cal.get(Calendar.MINUTE));
        System.out.println("Second : "+cal.get(Calendar.SECOND));
        System.out.println("Millisecond : "+cal.get(Calendar.MILLISECOND));

        cal.add(Calendar.DATE, 10);
        System.out.println("Date : "+cal.get(Calendar.DATE));

        String dateString = String.format("%d년%d월%d일", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
        System.out.println(dateString);
    }
}
