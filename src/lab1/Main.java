package lab1;

import java.util.Scanner;

import de.tuhh.diss.io.SimpleIO;


public class Main {
	
	
	
	public static void main (String[] args)
	{
		double userWeight;       // the weight of a single user
		double userHeight;       // the height of a single user
		int NUM_PERSONS;         // the number of persons who wish to calculate their average bmi
 		double bmiSum = 0.0;     // the sum of all registered users' bmi

 	   SimpleIO.println("please enter the number of persons");
	   NUM_PERSONS = SimpleIO.readInteger();
		
   
	  
	   for(int i=0; i< NUM_PERSONS; i++){
		 	
	            SimpleIO.println("please enter your weight in kilograms");  //query the weight from the user
	 		 
	                userWeight = SimpleIO.readDouble();  
			
	           while(userWeight < 0.0){
			
	            SimpleIO.println("please enter your correct weight in kilograms");  // query the correct weight from the user
	        	userWeight = SimpleIO.readDouble(); 
		    }

	            SimpleIO.println("please enter your height in meters."); // query the height from the user
	         
	            
	           
	               userHeight = SimpleIO.readDouble();  
			
        
	           while(userHeight>2.72 || userHeight<0.0){
				
	            SimpleIO.println("please enter your correct height in meters."); // query the correct height from the user
	        	userHeight = SimpleIO.readDouble();  
	         } 
		    
	            
	        	 BmiCalculation user = new BmiCalculation(userWeight,userHeight);  
	        	 SimpleIO.println("the BMI of user number " + (i+1) + " is " + user.calculateBmi());
	             bmiSum += user.calculateBmi();
	    }
	     
		
      SimpleIO.println("the average BMI of all users is " + bmiSum);
	        	
     }
	
}


	    
	           
	    
	    

