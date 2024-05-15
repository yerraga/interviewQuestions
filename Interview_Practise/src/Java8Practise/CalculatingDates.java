package Java8Practise;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalculatingDates {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(dateAfterTenDays(date));
		System.out.println(dateAfterTenDays(LocalDate.now()));
		System.out.println(dateBeforeTenDays(date));
		System.out.println(dateBeforeTenDays1(LocalDate.now()));
	}
	public static Date dateAfterTenDays(Date date) {
		Calendar calendar =  Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.SECOND,10*24*60*60);
		Date newDate = calendar.getTime();
		return newDate;
	}
	public static LocalDate dateAfterTenDays(LocalDate localDate) {
		localDate = localDate.plusDays(10);
		return localDate;
		
	}
	public static Date dateBeforeTenDays(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, - 10);
		Date newDate = calendar.getTime();
		return newDate;
	}
	
	public static LocalDate dateBeforeTenDays1(LocalDate localDate ) {
	localDate = localDate.minusDays(10);
	return localDate;
	}
 
	

}
