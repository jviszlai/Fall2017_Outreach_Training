/*
 * Google assistant, Siri, Alexa, and Cortana? They're not that good. You're going to make an even better AI assistant.
 * 	   
 * 
 *     PART 1:
 *       - Using a scanner, ask the user for their name and store it in a variable
 *         
 *         
 *     PART 2: 
 *       - Set up your assistant so it flows as follows:
 *       
 *          1) Prompts the user, with their name from Part 1, for a command
 *          
 *          2) If the command is the word quit, the assistant should stop
 *          
 *          3) If the command is not the word quit, the assistant should repeat with step 1
 * 
 * 
 * 	   PART 3: 
 *       - Add 3 more commands other than quit that are the following:
 *       
 *       	1) add: Should then ask the user for the first number,
 *       		 then the second number, and add the 2 numbers and print out the sum
 *       
 *       	2) subtract: Should then ask the user for the first number, 
 *       		 then the second number, and subtract the 2 numbers and print out the difference
 *       
 *          3) multiply: Should then ask the user for the first number, 
 *          	 then the second number, and multiply the 2 numbers and print out the product
 *          
 *          Note: For each of these, write a method that does the actual math and printing. 
 *          	 You should just need to give the method the numbers (and user's name if you want).
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

import java.util.Scanner;

public class November_25 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		boolean on = true;
		while (on) {
			System.out.println("What would you like me to do " + name + "?");
			String command = input.nextLine();
			if (command.equalsIgnoreCase("quit")) {
				System.out.println("Goodbye " + name + ".");
				on = false;
			} else if (command.equalsIgnoreCase("add")) {
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What is the second number?");
				int num2 = input.nextInt();
				add(name, num1, num2);
				input.nextLine();
			} else if (command.equalsIgnoreCase("subtract")) {
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What is the second number?");
				int num2 = input.nextInt();
				subtract(name, num1, num2);
				input.nextLine();
			} else if (command.equalsIgnoreCase("multiply")) {
				System.out.println("What is the first number?");
				int num1 = input.nextInt();
				System.out.println("What is the second number?");
				int num2 = input.nextInt();
				multiply(name, num1, num2);
				input.nextLine();
			} else if (command.equalsIgnoreCase("commands")) {
				System.out.println(name + " I am capable of doing the following: add, subtract, multiply, quit");
			} else {
				System.out.println(name + " I'm sorry, but I don't understand that command.");
			}
		}
		input.close();
	}
	
	static void add(String name, int num1, int num2) {
		System.out.println(name + ", the sum is " + (num1 + num2));
	}
	
	static void subtract(String name, int num1, int num2) {
		System.out.println(name + ", the difference is " + (num1 - num2));
	}
	
	static void multiply(String name, int num1, int num2) {
		System.out.println(name + ", the product is " + (num1 * num2));
	}
	
}
