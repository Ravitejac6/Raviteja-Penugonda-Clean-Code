package com.raviteja.clean_code;

public class InterestCalculate {
	
	public double simpleInterest(double principal,double time,double rateOfInterest){
		
        double simpleinterest = principal*time*rateOfInterest/100;
        
        return simpleinterest;
    }

    public double compoundInterest(double principal,double time,double rateOfInterest,double noOfTimes){
    	
        double amount = principal * Math.pow(1 + (rateOfInterest / noOfTimes), noOfTimes * time);
        double compoundinterest = amount - principal;
        return compoundinterest;
    }

}
