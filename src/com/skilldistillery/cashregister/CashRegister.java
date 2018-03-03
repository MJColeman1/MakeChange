package com.skilldistillery.cashregister;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		transactionProcess();

	}

	public static void transactionProcess() {
		Scanner kb = new Scanner(System.in);
		double price, tender;
		int remainder;
		// creates a boolean set to true for the 'while' loop.
		boolean flag = true;
		while (flag) {
			// Ask the customer what the price of the item they are purchasing is and
			// storing that into a double so a decimal value can be entered.
			System.out.print("What is the price of the item you'd like to purchase? ");
			price = kb.nextDouble();
			// Ask the customer how much money they will be providing to pay for the item
			// and store that into a double so a decimal value can be entered.
			System.out.print("How much money will be tendered to pay for the item? ");
			tender = kb.nextDouble();

			// create a variable that determines how much change is owed to the customer and
			// multiply by 100 to convert the doubles into integer values and drop the
			// decimal values.
			remainder = (int) ((tender - price) * 100);

			if (tender < price) {
				System.out.println("You did not provide enough funds. More money is required to pay for this item.");
				continue;
			} else if (tender == price) {
				System.out.println("Thank you for paying with exact change. Have a nice day.");
				break;
			} else {
				int amountOfTwenties = remainder / 2000;
				remainder %= 2000;
				if (amountOfTwenties != 0) {
					System.out.println("$20 bills: " + amountOfTwenties);
				}
				int amountOfTens = remainder / 1000;
				remainder %= 1000;
				if (amountOfTens != 0) {
					System.out.println("$10 bills: " + amountOfTens);
				}
				int amountOfFives = remainder / 500;
				remainder %= 500;
				if (amountOfFives != 0) {
					System.out.println("$5 bills: " + amountOfFives);
				}
				int amountOfOnes = remainder / 100;
				remainder %= 100;
				if (amountOfOnes != 0) {
					System.out.println("$1 bills: " + amountOfOnes);
				}
				int amountOfQuarters = remainder / 25;
				remainder %= 25;
				if (amountOfQuarters != 0) {
					System.out.println("Quarters: " + amountOfQuarters);
				}
				int amountOfDimes = remainder / 10;
				remainder %= 10;
				if (amountOfDimes != 0) {
					System.out.println("Dimes: " + amountOfDimes);
				}
				int amountOfNickels = remainder / 5;
				remainder %= 5;
				if (amountOfNickels != 0) {
					System.out.println("Nickels: " + amountOfNickels);
				}
				int amountOfPennies = remainder / 1;
				remainder %= 1;
				if (amountOfPennies != 0) {
					System.out.println("Pennies: " + amountOfPennies);
				}
				break;
			}
		}
		
		kb.close();
	}

}