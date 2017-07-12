package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Programm TurnTest.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 11.07.2017
 */
 	public class TurnTest {
 	/**
 	* Test for Turn.
 	* Tested even number of elements in the array
 	*/
 	@Test
 	public void whenArrayWithEvenNumberOfElementsThenRotatedByArray() {
 		Turn turn = new Turn();
 		int[] arr = {1, 4, 6, 8};
 		int[] result = turn.back(arr);
 		int[] expected = {8, 6, 4, 1};
 		assertThat(result, is(expected));
 	}
 	/**
 	* Test for Turn.
 	* Tested odd number of elements in the array
 	*/
 	@Test
 	public void whenArrayWithOddNumberOfElementsThenRotatedByArray() {
 		Turn turn = new Turn();
 		int[] arr = {3, 1, 4, 6, 8};
 		int[] result = turn.back(arr);
 		int[] expected = {8, 6, 4, 1, 3};
 		assertThat(result, is(expected));
 	}
}