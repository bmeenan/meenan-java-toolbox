package com.bmeenan.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {

	/**
	 * Return the same date passed in with the day of the day set to 1
	 */
	public Date getReportStartDate(Date startDate) {

		if (Objects.isNull(startDate)) {
			return null;
		}

		Calendar cal = getCalendarInstance(startDate);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));

		return cal.getTime();
	}

	/**
	 * Return the same date passed in with the day of the month set to the end of
	 * the month
	 */

	public Date getReportEndDate(Date endDate) {

		if (Objects.isNull(endDate)) {
			return null;
		}

		Calendar cal = getCalendarInstance(endDate);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));

		return cal.getTime();
	}

	private Calendar getCalendarInstance(Date seedDate) {
		// init with date passed in
		Calendar cal = Calendar.getInstance();
		cal.setTime(seedDate);

		// set hours, minutes, seconds, milliseconds to 0
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal;
	}

}
