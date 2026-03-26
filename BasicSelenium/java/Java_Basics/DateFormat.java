package Java_Basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-mm-dd");
		String actdate=sim.format(dateobj);
		
		System.out.println(actdate);
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String daterequires=sim.format(cal.getTime());
		System.out.println(daterequires);
		
		
	}

}
