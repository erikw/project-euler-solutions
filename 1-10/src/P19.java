public class P19 {

	private int year;
	private int month;
	private int date;
	private int weekday;

	private static int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String args[]) {
		new P19().run();
	}

	private void incWeekday() {
		weekday++;
		if (weekday == 7) {
			weekday = 0;
		}
	}

	public P19 () {
		year = 1900;
		month = 0;
		date = 0;
		weekday = 0;
	}

	private boolean isLeapYear() {
		if (year % 100 == 0) {
			return year % 400 == 0;
		} else {
			return year % 4 == 0;
		}
	}

	public void run() {
		int sunCount = 0;
		while (year <= 2000 && month <= 11) {
			if (weekday == 6 && date == 0 && year != 1900) {
				sunCount++;
			}
			date++;
			if (date >= daysInMonth[month] && !(month == 1 &&  date == 28 && isLeapYear())) {
			//if (date >= daysInMonth[month]) {
				date = 0;
				month++;
				if (month == 12) {
					month = 0;
					year++;
				}
			}
			incWeekday();
		}
		System.out.printf("Number sundays on 1st: %d\n", sunCount);
	}
}

