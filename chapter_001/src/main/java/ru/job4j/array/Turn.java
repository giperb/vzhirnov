package ru.job4j.array;

/**
 * Programm Turn.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 11.07.2017
 */
public class Turn {
	/**
	* The method must inverted the array.
	* @param array - integer array
	* @return inverted array
	*/
	public int[] back(int[] array) {
	int[] result = new int[array.length];
		for (int i = 0, j = 1; i < array.length; i++, j++) {
			result[i] = array[array.length - j];
		}
		return result;
	}
}