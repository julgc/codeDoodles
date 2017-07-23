package com.acae.controller;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 

import com.acae.model.DailyCostBreakDown;
import com.acae.service.DailyCostBreakDownService;

@RestController
public class DailyCostBreakDownController {
	@Autowired
	DailyCostBreakDownService svc;

	@RequestMapping(value = "${com.acae.controller.dailybreakdown.uri}/{itemDate}", method = RequestMethod.GET)
	public DailyCostBreakDown getBreakDownOnDate(@PathVariable("itemDate") Date itemDate) throws ParseException {
		DailyCostBreakDown breakDownData = svc.findDailyCostBreakDownByDateOfReceipt(itemDate);
		if (breakDownData == null) {
			breakDownData = new DailyCostBreakDown();
			breakDownData.setDateOfReceipt(itemDate);
		}
		return breakDownData;
	}

	@RequestMapping(value = "${com.acae.controller.dailybreakdown.uri}", method = RequestMethod.POST, consumes = {
			"application/json" })
	public void addDailyCostBreakDown(@RequestBody DailyCostBreakDown dailyBreakDown) {
		svc.addDailyCostBreakDown(dailyBreakDown);
	}

	@RequestMapping(value = "${com.acae.controller.dailybreakdown.uri}/{itemDate}", method = RequestMethod.PUT, consumes = {
			"application/json" })
	public void updateDailyCostBreakDown(@RequestParam DailyCostBreakDown dailyBreakDown) {
		svc.updateDailyCostBreakDown(dailyBreakDown);
	}

	@RequestMapping(value = "${com.acae.controller.dailybreakdown.uri}{itemDate}", method = RequestMethod.DELETE)
	public void deleteDailyCostBreakDown(@PathVariable("itemDate") Date itemDate) throws ParseException {
		DailyCostBreakDown dailyBreakDown = svc.findDailyCostBreakDownByDateOfReceipt(itemDate);
		svc.deleteDailyCostBreakDown(dailyBreakDown);
	}

}
