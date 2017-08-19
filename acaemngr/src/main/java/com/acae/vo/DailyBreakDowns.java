package com.acae.vo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acae.model.DailyBreakDown;

@Component
public class DailyBreakDowns {
	List<DailyBreakDown> breakdowns = new ArrayList<DailyBreakDown>();

	public List<DailyBreakDown> getBreakdowns() {
		return breakdowns;
	}

	public void setBreakdowns(List<DailyBreakDown> breakdowns) {
		this.breakdowns = breakdowns;
	}
}
