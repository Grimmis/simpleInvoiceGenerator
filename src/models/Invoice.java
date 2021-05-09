package models;

import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	
	String invoiceIssuer;
	Date invoiceDate;
	Date payFromDate;
	Date payByDate;
	
	int regularPrice;
	int childsPrice;
	int discout;
	
	private class Customer {	
		@SuppressWarnings("unused")
		public String lastName; 
		@SuppressWarnings("unused")
		public String givenNames;
		@SuppressWarnings("unused")
		public String title; // "MR" or "MS"
		
		@SuppressWarnings("unused")
		public Customer(String lastName, String givenNames, String title) {
			super();
			this.lastName = lastName;
			this.givenNames = givenNames;
			this.title = title;
		}
		
	}
	
	ArrayList<Customer> customers = new ArrayList<>();
	int numberOfAdults;
	int numberOfChildren;
	
	int adultPriceSubtotal;
	int childPriceSubtotal;
	int priceTotal;
	
	public Invoice(String invoiceIssuer, Date invoiceDate, Date payFromDate, Date payByDate, int regularPrice,
			int childsPrice, int discout, ArrayList<Customer> customers, int numberOfAdults, int numberOfChildren) {
		super();
		this.invoiceIssuer = invoiceIssuer;
		this.invoiceDate = invoiceDate;
		this.payFromDate = payFromDate;
		this.payByDate = payByDate;
		this.regularPrice = regularPrice;
		this.childsPrice = childsPrice;
		this.discout = discout;
		this.customers = customers;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
		this.adultPriceSubtotal = numberOfAdults * regularPrice;
		this.childPriceSubtotal = numberOfChildren * childsPrice;
		this.priceTotal = this.adultPriceSubtotal + this.childPriceSubtotal - discout;
	}
	
	
	
	
}
