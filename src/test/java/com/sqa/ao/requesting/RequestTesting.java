/**
 * File Name: RequestTesting.java<br>
 * LastName, FirstName<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 10, 2015
 */
package com.sqa.ao.requesting;

import java.util.Arrays;

import org.junit.Test;

/**
 * RequestTesting //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class RequestTesting {

	/**
	 * Test to test requestBooleanValue() method and provide a response based on
	 * returned value
	 */
	@Test
	// @Ignore
	public void booleanTest() {
		boolean isHungry = RequestValues.requestBooleanValue("Are you hungry?");
		if (isHungry) {
			System.out.println("Lets go eat!");
		} else {
			System.out.println("Good, I do not want to eat with you!");
		}
	}

	/**
	 * Test to test requestDoubleValue() method and provide a response based on
	 * returned value
	 */
	@Test
	// @Ignore
	public void doubleTest() {
		double number = RequestValues.requestDoubleValue("Please pick a double number?" + " ");
		System.out.println("You have supplied the number: " + number);
	}

	/**
	 * Test to test requestFloatValue() method and provide a response based on
	 * returned value
	 */
	@Test
	// @Ignore
	public void floatTest() {
		float number = RequestValues.requestFloatValue("Please pick a float number?" + " ");
		System.out.println("You have supplied the number: " + number);
	}

	/**
	 * Test to test requestIntValue() method and provide a response based on
	 * returned value
	 */
	@Test
	// @Ignore
	public void intTest() {
		int number = RequestValues.requestIntValue("Please pick a number?" + " ");
		System.out.println("You have supplied the number: " + number);
	}

	/**
	 * Test to test overloaded requestStringValue() method and provide a
	 * response based on returned value, default "," as delimiter (when using
	 * "," as delimiter the replace operation will replace white spaces in
	 * between words with hyphens)
	 */
	@Test
	// @Ignore
	public void stringsOverloadedTest() {
		String[] words = RequestValues.requestStringValues("Please proivide a list of sports?");
		System.out.println("You have supplied the words: " + Arrays.deepToString(words));
	}

	/**
	 * Test to test requestStringValuse() method and provide a response based on
	 * returned value
	 */
	@Test
	// @Ignore
	public void stringsText() {
		String[] words = RequestValues.requestStringValues("Please proivide a list of sports?", " ");
		System.out.println("You have supplied the words: " + Arrays.deepToString(words));
	}
}
