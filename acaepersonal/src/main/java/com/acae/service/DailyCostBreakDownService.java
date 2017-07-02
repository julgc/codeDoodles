package com.acae.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.model.DailyCostBreakDown;
import com.acae.repository.DailyCostBreakDownRepository;

@Service
public class DailyCostBreakDownService {
	@Autowired
	DailyCostBreakDownRepository repo;

	public DailyCostBreakDown findDailyCostBreakDownByDateOfReceipt(
			String dateOfReceiptStr) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-Mmm-yyyy");
		Date dateOfReceipt = sdf.parse(dateOfReceiptStr);
		return repo.findDailyCostBreakDownByDateOfReceipt(dateOfReceipt);
	}

	public void addDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		repo.save(dailyBreakDown);
	}

	public void updateDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		repo.save(dailyBreakDown);
	}

	public void deleteDailyCostBreakDown(DailyCostBreakDown dailyBreakDown) {
		repo.delete(dailyBreakDown);
	}
}
