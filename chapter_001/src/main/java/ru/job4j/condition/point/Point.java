package ru.job4j.condition.point;

 /**
 * Point.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class Point {
 	/**
	* @param x number
	*/
	private int x;
	/**
	* @param y number
	*/
	private int y;
	/**
	* Method point.
	* @param x first coordinate
	* @param y second coordinate
	*/
 	public Point(int x, int y) {
 		this.x = x;
 		this.y = y;
 	}
 	/**
 	* The method get for 'x'.
 	* @return value 'x'
 	*/
 	public int getX() {
 		return this.x;
 	}
 	/**
 	* The method get for 'y'.
 	* @return value 'y'
 	*/
 	public int getY() {
 		return this.y;
 	}
 	/**
 	* The method determines whether a point is on this function.
 	* @param a - first number
 	* @param b - second number
 	* @return true or false
 	*/
 	public boolean is(int a, int b) {
 		return this.y == a * this.x + b;
 	}
 }