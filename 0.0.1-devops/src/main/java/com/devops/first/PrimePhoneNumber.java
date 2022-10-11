package com.devops.first;

public class PrimePhoneNumber {

	
	public boolean checkPrime(long phoneno) {
		
		if(phoneno == 0 || phoneno ==  1 ) {
			return false;
		} 
		else if(phoneno == 2) {
			return true;
		}
		else if(phoneno % 2 == 0) {
			return false;
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		long phoneno;
		phoneno = 966510234;
		
		PrimePhoneNumber pn = new PrimePhoneNumber();
		
		System.out.println(pn.checkPrime(phoneno));
		
	}
}
