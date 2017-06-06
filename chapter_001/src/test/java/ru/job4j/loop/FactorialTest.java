package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * FactorialTest.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class FactorialTest {
 	/**
 	* Test for calc.
	* Tested factorial for five.
	*/
	@Test
	public void whenCalculateFactorialForFive() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		assertThat(result, is(120));
	}
	/**
	* Test for calc.
	* Tested factorial for zero.
	*/
	@Test
	public void whenCalculateFactorialForZero() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		assertThat(result, is(1));
	}
	/**
	* Test for calc.
	* Tested the factorial for negative numbers.
	*/
	@Test
	 	public void whenCalculateFactorialForNegativeNumbers() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(-5);
		assertThat(result, is(-1));
	}
}