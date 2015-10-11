/**
 *   File Name: RequestTesting.java<br>
 *
 *   Yutaka<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Oct 10, 2015
 *   
 */

package com.sqa.ao.requesting;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

/**
 * RequestTesting //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Yutaka
 * @version 1.0.0
 * @since 1.0
 *
 */
public class RequestTesting {

	@Test
	@Ignore
	public void test() {
		boolean isHungry = RequestValues.requestBooleanValue("Are you hungry?");
		if (isHungry) {
			System.out.println("Lets go eat!");
		} else {
			System.out.println("Good, I do not want to eat with you!");
		}
	}

	@Test
	// @Ignore
	public void test2() {
		int number = RequestValues.requestIntValue("please pick a number?");
		System.out.println("You have supplied the number: " + number);
	}

	@Test
	// @Ignore
	public void test3() {
		double number = RequestValues.requestDoubleValue("please pick a double number?");
		System.out.println("You have supplied the number: " + number);
	}

	@Test
	// @Ignore
	public void test4() {
		float number = RequestValues.requestFloatValue("please pick a float number?");
		System.out.println("You have supplied the number: " + number);
	}

	@Test
	// @Ignore
	public void test5() {
		String words = RequestValues.requestStringValues("please provide a list of sorts?");
		System.out.println("You have supplied a word: " + Arrays.deepToString(words);
	}

	@Test
	// @Ignore
	public void test6() {
		String words = RequestValues.requestStringValues("please provide a list of sorts?");
		System.out.println("You have supplied a word: " + Arrays.deepToString(words);
	}

}
