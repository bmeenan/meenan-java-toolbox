package com.bmeenan.dates;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DateTests {

	DateUtils dateUtils = new DateUtils();

	@Test
	public void whenStartDateIsMiddleOfTheMonth_ReportStartDateIsFirstOfTheMonth() {
		Calendar submittedStartDate = Calendar.getInstance();

		// set test start date to jan 15th - expected return should be Jan 1st
		submittedStartDate.set(Calendar.MONTH, 0);
		submittedStartDate.set(Calendar.DAY_OF_MONTH, 15);

		Date reportStartDate = dateUtils.getReportStartDate(submittedStartDate.getTime());

		Calendar cal = Calendar.getInstance();
		cal.setTime(reportStartDate);
		Assert.assertEquals(1, cal.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void whenEndDateIsMiddleOfTheMonth_ReportEndDateIsLastOfTheMonth() {
		Calendar submittedEndDate = Calendar.getInstance();

		// set test end date to jan 15th - expected return should be Jan 1st
		submittedEndDate.set(Calendar.MONTH, 0);
		submittedEndDate.set(Calendar.DAY_OF_MONTH, 15);

		Date reportEndDate = dateUtils.getReportEndDate(submittedEndDate.getTime());

		Calendar cal = Calendar.getInstance();
		cal.setTime(reportEndDate);
		Assert.assertEquals(31, cal.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void whenStartDateIsNull_NullIsReturned() {
		Assert.assertNull(dateUtils.getReportStartDate(null));
	}

	@Test
	public void whenEndDateIsNull_NullIsReturned() {
		Assert.assertNull(dateUtils.getReportEndDate(null));
	}

	@Test
	public void formatDateTest() throws ParseException {
		dateUtils.formatDateWithTimezoneAndConvertToUTC("2018-12-13 11:06:23 EST");
		dateUtils.formatDateWithTimezoneAndConvertToUTC("2018-12-13 11:06:23 CST");
		dateUtils.formatDateWithTimezoneAndConvertToUTC("2018-12-13 11:06:23 MST");

	}
}
