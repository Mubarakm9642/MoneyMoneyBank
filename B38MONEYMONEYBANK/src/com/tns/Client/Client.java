package com.tns.Client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1050,"Mubarak",1000,true);
		sa.withdraw(sa.getwithdraw());
		System.out.println(sa.toString());
		
		CurrentAcc ca = new MMCurrentAcc(1060,"Imran",2000,100);
		ca.withdraw(ca.getwithdraw());
		ca.toString();
		

	}

}