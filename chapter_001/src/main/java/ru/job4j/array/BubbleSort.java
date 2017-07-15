package ru.job4j.array;

/**
 * Program BubbleSort.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @since 14.07.2017
 * @version 0.1
 */
 class BubbleSort {
 	/**
 	 * The method must sort the array.
 	 * @param array - not sorted array
 	 * @return - sorted array
 	 */
 	public int[] sort(int[] array) {
 		for (int i = 0; i < array.length - 1; i++) {
 			for (int j = 0; j < array.length - i - 1; j++) {
 				if (array[j] > array[j + 1]) {
 					int temp = array[j];
 					array[j] = array[j + 1];
 					array[j + 1] = temp;
 				}
 			}
 		}
 		return array;
 	}
 }