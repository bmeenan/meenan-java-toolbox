package com.bmeenan.dates;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class DateTests {

	DateUtils dateUtils = new DateUtils();

	@Test
	public void whenStartDateIsMiddleOfTheMonth_ReportStartDateIsFirstOfTheMonth() {
		Calendar submittedStartDate = Calendar.getInstance();
		submittedStartDate.set(Calendar.DAY_OF_MONTH, 15);

		Date reportStartDate = dateUtils.getReportStartDate(submittedStartDate.getTime());

		Calendar cal = Calendar.getInstance();
		cal.setTime(reportStartDate);
		Assert.assertEquals(15, cal.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void whenEndDateIsMiddleOfTheMonth_ReportEndDateIsLastOfTheMonth() {
		Calendar submittedEndDate = Calendar.getInstance();
		submittedEndDate.set(Calendar.DAY_OF_MONTH, 15);

		Date reportEndDate = dateUtils.getReportEndDate(submittedEndDate.getTime());

		Calendar cal = Calendar.getInstance();
		cal.setTime(reportEndDate);
		Assert.assertEquals(cal.getActualMaximum(Calendar.DAY_OF_MONTH), cal.get(Calendar.DAY_OF_MONTH));
	}

}
