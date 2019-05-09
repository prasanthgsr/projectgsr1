package com.cg.eis.bean;

public class Account {
private int accountNo;
private String CustomerName;
private int MobileNo;
private double balance;
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(int accountNo, String customerName, int mobileNo, double balance) {
	super();
	this.accountNo = accountNo;
	this.CustomerName = customerName;
	this.MobileNo = mobileNo;
	this.balance = balance;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}

public int getMobileNo() {
	return MobileNo;
}
public void setMobileNo(int mobileNo) {
	MobileNo = mobileNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", customerName=" + CustomerName + ", mobileNo=" + MobileNo
			+ ", balance=" + balance + "]";
}
}
