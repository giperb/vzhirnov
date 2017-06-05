package ru.job4j.loop;

 /**
 * Программа Counter.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Counter {
 	/**
	* max.
	* @param first number
	* @param second number
	* @return the sum of even numbers
	*/
 	public int add(int start, int finish) {
 		int result = 0;
 			for (int i = start; i <= finish; i++) {
 			if (i % 2 == 0) {
 			result += i;
 			}
 		}
 		return result;
 	}
 }