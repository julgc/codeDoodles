package com.acae.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acae.model.DailyBreakDown;
import com.acae.vo.DailyBreakDowns;

@Controller
public class AcaeForMonthController {
	@Autowired
	DailyBreakDowns breakdowns;

	@RequestMapping("/acaeformonth")
	public String redir1(ModelMap model) {

		for (int i = 0; i < 10; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
			try {
				Date dateR = sdf.parse("01-Jan-2017");
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(dateR);
				calendar.add(Calendar.DATE, i);
				dateR = calendar.getTime();
				breakdowns.getBreakdowns().add(new DailyBreakDown(dateR));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		model.put("breakdowns", breakdowns);
		return "/acaeformonth";
	}
}
