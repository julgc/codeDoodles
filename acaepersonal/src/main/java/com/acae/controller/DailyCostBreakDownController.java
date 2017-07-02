package com.acae.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acae.model.DailyCostBreakDown;
import com.acae.service.DailyCostBreakDownService;

@RestController
public class DailyCostBreakDownController {
	@Autowired
	DailyCostBreakDownService svc;

	@RequestMapping(value = "/acae/{itemDate}", method = RequestMethod.GET)
	public DailyCostBreakDown getBreakDownOnDate(
			@PathVariable("itemDate") String itemDate) {
		try {
			return svc.findDailyCostBreakDownByDateOfReceipt(itemDate);
		} catch (ParseException e) {
			e.printStackTrace();
			// TODO Error Handling
			return null;
		}
	}

	public void addDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		svc.addDailyCostBreakDown(dailyBreakDown);
	}

	public void updateDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		svc.updateDailyCostBreakDown(dailyBreakDown);
	}

	public void deleteDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		svc.deleteDailyCostBreakDown(dailyBreakDown);
	}

}
