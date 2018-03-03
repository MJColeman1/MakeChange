package com.skilldistillery.cashregister;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double twenty = 20.00, ten = 10.00, five = 5.00, one = 1.00, quarter = .25, dime = .10, nickel = .05, 
		penny = .01, price, tender, returnToCust;
		
		System.out.print("What is the price of the item you'd like to purchase? ");
		price = kb.nextDouble();
		System.out.print("How much money will be tendered to pay for the item? ");
		tender = kb.nextDouble();
		returnToCust = tender - price;
		System.out.println(returnToCust + " is your change. Thank you.");
	}

}
