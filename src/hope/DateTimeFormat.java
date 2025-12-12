package hope;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeFormat {
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(2002, 9, 23);

		System.out.println(today);
		System.out.println(birth);

		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalDateTime datetimenow = LocalDateTime.now();
		System.out.println(datetimenow);

		Instant ins = Instant.now();
		System.out.println(ins + "ins");
		System.out.println(datetimenow);

		Period p = Period.between(birth, today);
		System.out.println(p.getYears() + "/" + p.getMonths() + "/" + p.getDays());

		long days = ChronoUnit.DAYS.between(birth, today);
		System.out.println("Tổng số ngày: " + days);

//		java.sql.Date / springboot nên dùng java.time?
//		calendar

	}
}
