package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Program BubbleSortTest.
 * @author Vladimir Zhirnov (harabe@yandex.ru);
 * @since 14.07.2017
 * @version 0.1
 */

 public class BubbleSortTest {
 	/**
 	 * Test for method sort.
 	 * Testing array sort
 	 */
 	 @Test
 	 public void whenSortArrayWithTenElementsTwelveSortedArray() {
 	 	BubbleSort bubble = new BubbleSort();
 	 	int[] arr = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5, 11, 6};
 	 	int[] resultArray = bubble.sort(arr);
 	 	int[] expectArray = {0, 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 11};
 	 	assertThat(resultArray, is(expectArray));
 	 }
 }