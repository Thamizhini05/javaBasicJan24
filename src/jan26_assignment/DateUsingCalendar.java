package jan26_assignment;
import java.util.Calendar;
import java.util.Date;
public class DateUsingCalendar {
	
	public static void main(String[] args) {
		        Calendar cal = Calendar.getInstance();
		        Date curDate = cal.getTime();
		        System.out.println("Current Date: " + curDate);
		    }
		}
