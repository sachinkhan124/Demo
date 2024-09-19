package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
     LocalDate date = LocalDate.now();
     LocalTime time = LocalTime.now();
     LocalDateTime datetime = LocalDateTime.now();
     
     System.out.println("Date:"+date);
     System.out.println("Time:"+time);
     System.out.println("DateTime:"+datetime);

	}

}
