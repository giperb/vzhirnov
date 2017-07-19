package ru.job4j.array;
/**
 * Program RotateArray.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 18.07.2017
 */
public class RotateArray {
	/**
	 * The method must rotate the two-dimensional array clockwise.
	 * @param array - array numbers
	 * @return rotate array
	 */
	public int[][] rotate(int[][] array) {
		int[][] result = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
					result[j][array.length - 1 - i] = array[i][j];
			}
		}
		return result;
	}
}