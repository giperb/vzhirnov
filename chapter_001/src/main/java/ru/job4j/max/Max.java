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
	* @return max number
	*/
 	public int max(int first, int second) {
 		return first > second ? first : second;
 	}
 	/**
	* max.
	* @param first number
	* @param second number
	* @param third number
	* @return max number
	*/
 	public int max(int first, int second, int third) {
 		return Math.max(first, Math.max(second, third));
 	}
 }