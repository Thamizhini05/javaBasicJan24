package jan26_assignment;
import java.util.Calendar;
public class MaxYearMonthWeekDateFromCurrent {

	public static void main(String[] args) {
		        Calendar cal = Calendar.getInstance();
		        int maxYear = cal.getActualMaximum(Calendar.YEAR);
		        int maxMonth = cal.getActualMaximum(Calendar.MONTH) + 1; // month starts from 1
		        int maxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		        int maxDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		        System.out.println("Maximum Year: " + maxYear);
		        System.out.println("Maximum Month: " + maxMonth);
		        System.out.println("Maximum Week: " + maxWeek);
		        System.out.println("Maximum Date: " + maxDate);
		    }
		}
