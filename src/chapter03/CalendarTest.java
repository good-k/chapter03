package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// Calendar는 추상 클래스
		// 바로 객체 생성을 할 수 없다.
		// Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, 10); //month(11) - 1
		cal.set(Calendar.DATE, 31);
		printDate(cal);
		
		cal.set(1971, 12, 18);
		cal.add(Calendar.DATE, 20000);
		printDate(cal);
	}

	public static void printDate(Calendar cal) {
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); //0~11
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		
		System.out.println(
			year + "/" + 
			(month+1) + "/" + 
			date + "(" +
			days[day-1] + ") " +
			hour + ":" + 
			minute + ":" + 
			second );
	}
}
