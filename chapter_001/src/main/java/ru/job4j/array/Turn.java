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
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		return array;
	}
}