package com.raviteja.clean_code;

import java.io.*;

public class App 
{
    public static void main( String[] args ) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What operation you want to preform.......\n");
        System.out.println("1.Interest Calculation\n2.Construction cost Estimation\n\nEnter your option : ");
        int option = Integer.parseInt(br.readLine());
        if(option == 1){
            InterestCalculate i = new InterestCalculate();
            double interest = 0;
            System.out.println("\n1.Simple Interest\n2.Compond Interest\n\nEnter your option : ");
            int typeofInterest = Integer.parseInt(br.readLine());
            double principal,rateofInterest,time,noOfTimesPerYear;
            System.out.println("\nEnter Principal Amount : ");
            principal = Double.parseDouble(br.readLine());
            System.out.println("\nEnter Rate of Interest : ");
            rateofInterest = Double.parseDouble(br.readLine());
            System.out.println("\nEnter Time period : ");
            time = Double.parseDouble(br.readLine());
            if(typeofInterest == 1){
            	interest = i.simpleInterest(principal,time,rateofInterest);
            }
            else {
            	System.out.println("\nEnter number of times interest to be calculated : ");
                noOfTimesPerYear = Double.parseDouble(br.readLine());
                interest = i.compoundInterest(principal,time,rateofInterest,noOfTimesPerYear);
            }
            System.out.println("\nTotal Interest : " + interest+" INR.\n");
            System.out.println("Total Amount : " + (principal+interest) + " INR.\n");
        }
        else{
            Estimate est = new Estimate();
            System.out.println("Enter the Area of the House : ");
            double area = Double.parseDouble(br.readLine());
            System.out.println("\nMaterial Standards - Cost per Square Feet \n1.Normal Standard - 1200INR\n2.Above Standard - 1500INR\n3.High Standard - 1800INR\n4.High Standard with fully Automated - 2500INR\n");
            System.out.println("\nEnter  your option : ");
            int standard = Integer.parseInt(br.readLine());
            System.out.println("Do you want Fully Automated home?(y/n)");
            String decision = br.readLine();
            boolean fullyautomated = false;
            if(decision.charAt(0) == 'y')
                fullyautomated = true;
            double estimatedcost = est.estimateHouse(area, standard, fullyautomated);
            System.out.println("Estimated cost for Construction is "+estimatedcost + " INR\n");
        }
        br.close();
    }
}