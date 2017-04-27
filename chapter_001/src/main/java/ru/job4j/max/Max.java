package ru.job4j.max;

 /**
 * Программа Max.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Max {
 	/**
	* max.
	* @param first number
	* @param second number
	* @return maxNum - максимальное число
	*/
 	public int max(int first, int second) {
 		return first > second ? first : second;
 	}
 }