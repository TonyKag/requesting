/**
 * File Name: RequestValues.java<br>
 * LastName, FirstName<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 10, 2015
 */
package com.sqa.jmn.requesting;

import java.util.Scanner;

/**
 * RequestValues //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class RequestValues {

	// static reference to a scanner object that can be used for all methods
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Static helper method that requests a boolean value from user of yes or
	 * no, must make a choice
	 *
	 * @param question
	 *            To be asked to base yes or no result on
	 * @return the resulting value of true or false based on what user chose
	 */
	public static boolean requestBooleanValue(String question) {
		boolean endValue = true;
		while (true) {
			System.out.print(question);
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
				endValue = true;
				break;
			} else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				endValue = false;
				break;
			} else {
				System.out.println("You must enter Yes/Y or No/N.");
				continue;
			}
		}
		return endValue;
	}

	/**
	 * Static helper method that requests an double value from user, number must
	 * convert to douuble properly to be valid or else will repeat
	 *
	 * @param question
	 *            To be asked to base double result from
	 * @return the resulting value of double based on what user input
	 */
	public static double requestDoubleValue(String question) {
		int intValue = 0;
		String input;
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				intValue = Integer.parseInt(input);
				return intValue;
			} catch (NumberFormatException e) {
				question = "Please supply a valid int number:";
				continue;
			}
		}
	}

	/**
	 * Static helper method that requests an float value from user, number must
	 * convert to float properly to be valid or else will repeat
	 *
	 * @param question
	 *            To be asked to base float result from
	 * @return the resulting value of float based on what user input
	 */
	public static float requestFloatValue(String question) {
		float floatValue = 0;
		String input;
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				floatValue = Float.parseFloat(input);
				return floatValue;
			} catch (NumberFormatException e) {
				question = "Please supply a valid float number:";
				continue;
			}
		}
	}

	/**
	 * Static helper method that requests an int value from user, number must
	 * convert to int properly to be valid or else will repeat
	 *
	 * @param question
	 *            To be asked to base int result from
	 * @return the resulting value of int based on what user input
	 */
	public static int requestIntValue(String question) {
		int intValue = 0;
		String input;
		while (true) {
			try {
				System.out.print(question);
				input = scanner.nextLine();
				intValue = Integer.parseInt(input);
				return intValue;
			} catch (NumberFormatException e) {
				question = "Please supply a valid int number:";
				continue;
			}
		}
	}

	/**
	 * Static helper method that requests multiple String values from user,
	 * String[] will be returned based on parsing one supplied String from user
	 * and separating it based on a delimiter. This method is overloaded to have
	 * a default "," delimiter
	 *
	 * @param question
	 *            To be asked to base String[] result from
	 * @return the resulting values of String with a String[], based on what
	 *         user input
	 */
	public static String[] requestStringValues(String question) {
		return requestStringValues(question, ",");
	}

	/**
	 * Static helper method that requests multiple String values from user,
	 * String[] will be returned based on parsing one supplied String from user
	 * and separating it based on a delimiter.
	 *
	 * @param question
	 *            To be asked to base String[] result from
	 * @param delimiter
	 *            String to use to separate words by
	 * @return the resulting values of String with a String[], based on what
	 *         user input
	 */
	public static String[] requestStringValues(String question, String delimiter) {
		String[] values;
		String input;
		System.out.print(question + "\n(Please provide one response seperating elements by a '" + delimiter + "'):");
		input = scanner.nextLine();
		// Split words based on a String pattern of text
		values = input.split(delimiter);
		for (int i = 0; i < values.length; i++) {
			// Trim surrounding white spaces
			values[i] = values[i].trim();
			// Replace inner white spaces with hyphens
			values[i] = values[i].replace(" ", "-");
		}
		// If the input string is more than 10 characters
		if (input.length() > 10) {
			// Use the substring method to return a subset of input string
			// (first 10 characters)
			System.out.println("Working on String : \"" + input.substring(0, 11) + "\"");
		} else {
			// Return input string, notice the escaped double quotes - \"
			System.out.println("Working on String : \"" + input + "\"");
		}
		return values;
	}
}
