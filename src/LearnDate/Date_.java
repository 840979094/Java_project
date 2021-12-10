package LearnDate;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

public class Date_ {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
//        SimpleDateFormat 线程不安全
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
//
        Calendar c = Calendar.getInstance();
//        System.out.println(c);
//        TimeZone tzDefault = TimeZone.getDefault(); // 当前时区
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
//        System.out.println(dt);

        LocalTime t2 = LocalTime.of(15, 16, 59); // 15:16:17
//        System.out.println(t2);

//        System.out.println(ZoneId.systemDefault());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }
}
