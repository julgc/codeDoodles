package com.acae.repository;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.acae.model.DailyCostBreakDown;
@Component
public interface DailyCostBreakDownRepository extends JpaRepository<DailyCostBreakDown, Serializable>{
	DailyCostBreakDown findDailyCostBreakDownByDateOfReceipt(Date dateOfReceipt);
}
