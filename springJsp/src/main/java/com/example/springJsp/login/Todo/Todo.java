package com.example.springJsp.login.Todo;

public class Todo {
	private int Id;
	private String Name;
	private String Address;
	private int MobileNumber;
	private String PaymentType;
	
	
	
	public Todo(int id, String name, String address, int mobileNumber, String paymentType) {
		super();
		Id = id;
		Name = name;
		Address = address;
		MobileNumber = mobileNumber;
		PaymentType = paymentType;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	@Override
	public String toString() {
		return "Todo [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", MobileNumber=" + MobileNumber
				+ ", PaymentType=" + PaymentType + "]";
	}
	

}
