package com.nt.upi;

public class UpiPaymentOperations {
	//Performs the UPI Payment
	public String doPayment(long phno,double amount) {
		return amount+" amount is paid to @phone number ::"+phno;
	}
}
