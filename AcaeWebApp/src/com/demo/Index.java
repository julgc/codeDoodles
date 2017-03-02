package com.demo;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sampleText;
	private List<String> sampleTexts;

	public List<String> getSampleTexts() {
		return sampleTexts;
	}

	public void setSampleTexts(List<String> sampleTexts) {
		this.sampleTexts = sampleTexts;
	}

	public String getSampleText() {
		return sampleText;
	}

	public void setSampleText(String sampleText) {
		this.sampleText = sampleText;
	}

	@Override
	public String execute() throws Exception {
		this.setSampleText("Text Generated from Struts");
		List<String> sampleTexts = new ArrayList<String>();
		for (int i = 0; i <= 5; i++) {
			sampleTexts.add("Sample String parsed from struts List data " + i);
		}
		this.setSampleTexts(sampleTexts);
		return SUCCESS;
	}
}
