package jan26_assignment;
import java.util.Calendar;
public class MinYearMonthWeekdateFromCurrent {

	public static void main(String[] args) {
		        Calendar cal = Calendar.getInstance();
		        int minYear = cal.getActualMinimum(Calendar.YEAR);
		        int minMonth = cal.getActualMinimum(Calendar.MONTH) + 1; // month starts from 1
		        int minWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
		        int minDate = cal.getActualMinimum(Calendar.DAY_OF_MONTH);

		        System.out.println("Minimum Year: " + minYear);
		        System.out.println("Minimum Month: " + minMonth);
		        System.out.println("Minimum Week: " + minWeek);
		        System.out.println("Minimum Date: " + minDate);
		    }
		}

