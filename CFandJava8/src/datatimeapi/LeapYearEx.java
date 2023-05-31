package datatimeapi;

import java.time.LocalDate;
import java.time.Year;

public class LeapYearEx {
	public static void main(String[] args) {
		Year year = Year.of(LocalDate.now().getYear());
		//System.out.println(year.isLeap());
		String msg = year.isLeap() ? "Yes ! Leap Year" : "Not ! Leap Year";
		System.out.println(msg);
		/*
		if(year.isLeap()) {
				System.out.println("Yes ! Leap Year");
		}
		else {
			System.out.println("Not ! Leap Year");
		}
		*/
	}
}
