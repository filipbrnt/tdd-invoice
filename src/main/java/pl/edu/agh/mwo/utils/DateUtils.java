package pl.edu.agh.mwo.utils;

import java.time.LocalDate;

public class DateUtils {
	public static boolean isMintersDay() {
		int day = LocalDate.now().getDayOfMonth();
		int month = LocalDate.now().getMonthValue();
		if (day == 10 && month == 1) {
			return true;
		}
		return false;
	}
}
