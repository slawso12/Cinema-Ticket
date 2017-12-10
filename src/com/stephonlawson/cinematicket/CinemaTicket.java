package com.stephonlawson.cinematicket;

public class CinemaTicket {

	public static void main(String[] args) {
		// declare variables
		int age = -1;  
		int senior = 65; 
		int child = 7;
		 
		if(senior != 65) {
			System.out.print("Pay $7");
		}         // if senior citizen, pay $7

		
		if(child != 7) {
			System.out.println("Pay $8");
		}        // if child, pay $8 
		
		if(age != -1) {
			System.out.println("Invalid age!");
		}
		
		else{
			System.out.println("Everyone else, pay $10"); 
		}
		
	            // everyone else, pay $10 
		
      
	}

}
