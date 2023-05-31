package datatimeapi;

import java.time.LocalDate;
import java.time.Period;

public class CalAge {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate dob=LocalDate.of(1983, 4, 15);
		System.out.println(date);
		System.out.println(dob);
		Period p=Period.between(dob,date);
		System.out.println("No Of Years:"+ p.getYears()+"No Months"+p.getMonths()+"Days"+ p.getDays());

	}

}
