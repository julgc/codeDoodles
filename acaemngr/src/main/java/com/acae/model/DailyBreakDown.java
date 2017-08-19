package com.acae.model;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DailyBreakDown implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@JsonFormat(pattern = "dd-MMM-yyyy")
	Date dateOfReceipt;

	float taxiBus;

	float gas;
	float toll;
	float parking;
	float carMaintenance;
	float mobile;
	float internet;

	float food;
	float dressCode;
	float wellness;

	float eyeCare;

	public DailyBreakDown() {
	}

	public DailyBreakDown(Date dateOfReceipt) {
		this.dateOfReceipt = dateOfReceipt;
	}

	public float getCarMaintenance() {
		return carMaintenance;
	}

	public Date getDateOfReceipt() {
		return dateOfReceipt;
	}

	public float getDressCode() {
		return dressCode;
	}

	public float getEyeCare() {
		return eyeCare;
	}

	public float getFood() {
		return food;
	}

	public float getGas() {
		return gas;
	}

	public float getInternet() {
		return internet;
	}

	public float getMobile() {
		return mobile;
	}

	public float getParking() {
		return parking;
	}

	public float getTaxiBus() {
		return taxiBus;
	}

	public float getToll() {
		return toll;
	}

	public float getWellness() {
		return wellness;
	}

	public void setCarMaintenance(float carMaintenance) {
		this.carMaintenance = carMaintenance;
	}

	public void setDateOfReceipt(Date dateOfReceipt) throws ParseException {
		this.dateOfReceipt = dateOfReceipt;
	}

	public void setDressCode(float dressCode) {
		this.dressCode = dressCode;
	}

	public void setEyeCare(float eyeCare) {
		this.eyeCare = eyeCare;
	}

	public void setFood(float food) {
		this.food = food;
	}

	public void setGas(float gas) {
		this.gas = gas;
	}

	public void setInternet(float internet) {
		this.internet = internet;
	}

	public void setMobile(float mobile) {
		this.mobile = mobile;
	}

	public void setParking(float parking) {
		this.parking = parking;
	}

	public void setTaxiBus(float taxiBus) {
		this.taxiBus = taxiBus;
	}

	public void setToll(float toll) {
		this.toll = toll;
	}

	public void setWellness(float wellness) {
		this.wellness = wellness;
	}
}
