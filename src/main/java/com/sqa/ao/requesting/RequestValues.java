package com.sqa.ao.requesting;
/**
 *   File Name: RequestValues.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

import java.util.Scanner;

/**
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestValues {
	private static Scanner scanner = new Scanner(System.in);

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

	public static double requestDoubleValue(String question) {
		double doubleValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				doubleValue = Double.parseDouble(input);
				return doubleValue;
			} catch (NumberFormatException e) {
				// System.out.println("Please supply a valid number.");
				question = "Please supply a valid double number.";
				continue;
			}
		}
	}

	public static float requestFloatValue(String question) {
		float floatValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				floatValue = Float.parseFloat(input);
				return floatValue;
			} catch (NumberFormatException e) {
				question = "Please supply a valid float number.";
				continue;
			}
		}
	}

	public static int requestIntValue(String question) {
		int intValue = 0;
		String input;
		while (true) {
			try {
				System.out.println(question);
				input = scanner.nextLine();
				intValue = Integer.parseInt(input);
				return intValue;
			} catch (NumberFormatException e) {
				// System.out.println("Please supply a valid number.");
				question = "Please supply a valid number.";
				continue;
			}
		}
	}

	public static String[] requestStringValues(String question) {
		return requestStringValues(question, ",");
	}

	public static String[] requestStringValues(String question, String delimiter) {
		String[] values;
		String input;
		System.out.print(question + "\n(Please provide one response seperating elements by a '" + delimiter + "'):");
		input = scanner.nextLine();
		values = input.split(delimiter);
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i].trim();
		}
		return values;
	}

}
