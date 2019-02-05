package com.bmeenan.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;

public class DateUtils {

	/**
	 * Java 7 date timezone conversion.
	 * 
	 * @throws ParseException
	 */
	public Date formatDateWithTimezoneAndConvertToUTC(String dateString) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");

		Date date = sdf.parse(dateString);
		System.out.println("original date: " + sdf.format(date));

		// now set the formatters timezone to UTC
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("converted date: " + sdf.format(date));

		return date;
	}

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
