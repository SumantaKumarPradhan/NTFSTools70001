package com.nt.nb;

public class NetBankingService {
	//By default performs RTGS payment
	public String transferMoney(long srcAccount,long destAmount,String ifscode,double amt) {
		return amt+" is transfering from "+srcAccount+" to "+destAmount;
	}
}
