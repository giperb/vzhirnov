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
 	public int add(int first, int second) {
 		int result = 0;
 		int start = first;
 		int finish = second;
 			for (int i = start; i <= finish; i++) {
 			if (i % 2 == 0) {
 			result = result + i;
 			}
 		}
 		return result;
 	}
 }