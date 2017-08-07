package ru.job4j.array;

import java.util.Arrays;
/**
 * Program ArrayDuplicate.
 *
 * @author Vladimir Zhirnov (mailto:harabe@yandex.ru)
 * @since 26.07.2017
 * @version 0.1
 */
public class ArrayDuplicate {
	/**
	 * The Method remove duplicate values.
	 * @param array - string array
	 * @return an array without duplicates
	 */
	public String[] remove(String[] array) {
		int counter = 0;
		for (int i = 0; i < array.length - counter; i++) {
			for (int j = i + 1; j < array.length - counter; j++) {
				if (array[j].equals(array[i])) {
					array[j] = array[array.length - 1 - counter];
					array[array.length - 1 - counter] = array[j];
					counter++;
					j--;
				}
			}
		}
		return Arrays.copyOf(array, array.length - counter);
	}
}