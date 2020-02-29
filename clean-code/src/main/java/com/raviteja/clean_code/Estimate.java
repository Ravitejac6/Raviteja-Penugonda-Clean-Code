package com.raviteja.clean_code;

public class Estimate {
	
	public double estimateHouse(double area,int standard,boolean fullyautomated){
        int arr[] = new int[4];
        arr[0] = 1200;
        arr[1] = 1500;
        arr[2] = 1800;
        arr[3] = 2500;
        int costpersqft = 0;
        double constructionCost = 0;
        
        if(fullyautomated){
            costpersqft = arr[3];
        }
        else {
            costpersqft = arr[standard-1];
        }
        
        constructionCost = area*costpersqft;
        return constructionCost;
    }
}
