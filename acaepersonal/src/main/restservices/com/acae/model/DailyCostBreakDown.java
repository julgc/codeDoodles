package com.acae.model;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "dateOfReceipt" }))
public class DailyCostBreakDown implements Serializable {
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

	public Date getDateOfReceipt() {
		return dateOfReceipt;
	}

	public void setDateOfReceipt(Date dateOfReceipt) throws ParseException {
		this.dateOfReceipt = dateOfReceipt;
	}

	public float getTaxiBus() {
		return taxiBus;
	}

	public void setTaxiBus(float taxiBus) {
		this.taxiBus = taxiBus;
	}

	public float getGas() {
		return gas;
	}

	public void setGas(float gas) {
		this.gas = gas;
	}

	public float getToll() {
		return toll;
	}

	public void setToll(float toll) {
		this.toll = toll;
	}

	public float getParking() {
		return parking;
	}

	public void setParking(float parking) {
		this.parking = parking;
	}

	public float getCarMaintenance() {
		return carMaintenance;
	}

	public void setCarMaintenance(float carMaintenance) {
		this.carMaintenance = carMaintenance;
	}

	public float getMobile() {
		return mobile;
	}

	public void setMobile(float mobile) {
		this.mobile = mobile;
	}

	public float getInternet() {
		return internet;
	}

	public void setInternet(float internet) {
		this.internet = internet;
	}

	public float getFood() {
		return food;
	}

	public void setFood(float food) {
		this.food = food;
	}

	public float getDressCode() {
		return dressCode;
	}

	public void setDressCode(float dressCode) {
		this.dressCode = dressCode;
	}

	public float getWellness() {
		return wellness;
	}

	public void setWellness(float wellness) {
		this.wellness = wellness;
	}

	public float getEyeCare() {
		return eyeCare;
	}

	public void setEyeCare(float eyeCare) {
		this.eyeCare = eyeCare;
	}
}
