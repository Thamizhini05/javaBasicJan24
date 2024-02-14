package jan26_assignment;
import java.time.*;
import java.util.*;
public class DifferenceBetweenTwoDates {

	public static void main(String[] args) {

		       LocalDate predate = LocalDate.of(2023, 01, 25);//(year,month,date)
		       LocalDate curdate = LocalDate.now();
		       Period ans = Period.between(predate, curdate);
		       System.out.printf("Diff is %d years, %d months and %d days old",
		    		  ans.getYears(), ans.getMonths(), ans.getDays());
		 }

		}