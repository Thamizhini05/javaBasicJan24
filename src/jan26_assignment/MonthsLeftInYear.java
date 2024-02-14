package jan26_assignment;
import java.time.LocalDate;
import java.time.Month;
public class MonthsLeftInYear {

	public static void main(String[] args) {
		        LocalDate curDate = LocalDate.now();
		        Month curMonth = curDate.getMonth();
		        int curYear = curDate.getYear();
		        int monthsLeft = 12 - curMonth.getValue();
		        System.out.println("Current Month: " + curMonth);
		        System.out.println("Current Year: " + curYear);
		        System.out.println("Number of Months Left in the Year: " + monthsLeft);
		    }
		}
