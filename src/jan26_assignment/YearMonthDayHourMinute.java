package jan26_assignment;
import java.util.Calendar;
public class YearMonthDayHourMinute {

	public static void main(String[] args) {
		        Calendar cal = Calendar.getInstance();
		        int year = cal.get(Calendar.YEAR);
		        int month = cal.get(Calendar.MONTH) + 1; // month starts from 1
		        int day = cal.get(Calendar.DAY_OF_MONTH);
		        int hour = cal.get(Calendar.HOUR_OF_DAY);
		        int minute = cal.get(Calendar.MINUTE);
		        System.out.println("Year: " + year);
		        System.out.println("Month: " + month);
		        System.out.println("Day: " + day);
		        System.out.println("Hour: " + hour);
		        System.out.println("Minute: " + minute);
		    }
		}

