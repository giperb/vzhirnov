package ru.job4j.loop;

/**
 * Programm Factorial.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Factorial {
 	/**
	* Calculate the factorial.
	* @param n - number.
	* @return result - factorial of n, or -1 for negative n.
	*/
 	public int calc(int n) {
 		int result = 1;
 		if (n >= 0) {
 			for (int i = 1; i <= n; i++) {
 			result *= i;
 			}
 		} else {
 		result = -1;
 		}
 	return result;
 	}
 }