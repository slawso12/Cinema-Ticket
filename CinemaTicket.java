package com.stephonlawson.cinematicket;

public class CinemaTicket {

	static boolean isStudent = true; 
	
	public static void main(String[] args) {
		// declare variables
		int age = 12;  
		int senior = 65; 
		int child = 7;
		 
		if(senior >= 65) {
			System.out.println("Senior Citizens pay $7.");
		}         // if senior citizen, pay $7

		
		if(child >= 7) {
			System.out.println("Children pay $8.");
		}        // if child, pay $8 
		
		if(age == -1) {
			System.out.println("Invalid age!");
		}		// output Invalid age! (when the age is less than)  
		
		if(isStudent == true) {
			System.out.println("College students pay $8.");
		}
		
		else{
			System.out.println("Everyone else, pays $10"); 
		}
		
	            // everyone else, pay $10 
		
      
	}

}
