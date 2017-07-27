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
 		for (int i = 0; i < array.length; i++) {
 			for (int j = array.length - 1; j > i; j--) {
 				if (array[i] == array[j] && array[j] != array[array.length - 1]) {
 					array[j] = array[array.length - 1];
 					array = Arrays.copyOf(array, array.length - 1);
 				} else if (array[i] == array [j] && array[j] == array[array.length - 1]) {
 						array = Arrays.copyOf(array, array.length - 1);
 					}
 			}
 		}
 	return Arrays.copyOf(array, array.length);
 	}
 }