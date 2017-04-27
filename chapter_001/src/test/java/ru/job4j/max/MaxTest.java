 package ru.job4j.max;
 import org.junit.Test;
 /**
 * Test.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class MaxTest {
 	/**
 	* Test 1 add.
 	*/
    @Test
    public void testMaxOneValue() {
 		Max maxValueOne = new Max();
 		maxValueOne.max(1, 2);
 	}
 	/**
 	* Test 2 add.
 	*/
    @Test
    public void testMaxTwoValue() {
 		Max maxValueTwo = new Max();
 		maxValueTwo.max(3, 2);
 	}
 }