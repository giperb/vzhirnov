package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Program RotateArrayTest.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 18.07.2017
 */
public class RotateArrayTest {
	/**
	 * Testing for method rotate.
	 * The method must rotate the two-dimensional array clockwise
	 * The tested values array 2 and 2
	 */
	 @Test
		public void whenArraySizeTwoOnTwoWhenRotateArray() {
			RotateArray rotateArr = new RotateArray();
			int[][] array = {{1, 2}, {3, 4}};
			int[][] resultArray = rotateArr.rotate(array);
			int[][] expectArray = {{3, 1}, {4, 2}};
			assertThat(resultArray, is(expectArray));
	}
	/**
	 * Testing for method rotate.
	 * The method must rotate the two-dimensional array clockwise
	 * The tested values array 3 and 3
	 */
	 @Test
		public void whenArraySizeThreeOnThreeWhenRotateArray() {
			RotateArray rotateArr = new RotateArray();
			int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
			int[][] resultArray = rotateArr.rotate(array);
			int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
			assertThat(resultArray, is(expectArray));
	}
}