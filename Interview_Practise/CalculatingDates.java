package Practise;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalculatingDates {
	
	public static void main(String[] args) {
		System.out.println(dateAfterTenDays(LocalDate.now()));
		
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

	

}
