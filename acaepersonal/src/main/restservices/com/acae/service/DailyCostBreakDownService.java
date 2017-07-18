package com.acae.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acae.model.DailyCostBreakDown;
import com.acae.repository.DailyCostBreakDownRepository;

@Service
public class DailyCostBreakDownService {
	@Autowired
	DailyCostBreakDownRepository repo;

	public DailyCostBreakDown findDailyCostBreakDownByDateOfReceipt(Date dateOfReceipt) {
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
