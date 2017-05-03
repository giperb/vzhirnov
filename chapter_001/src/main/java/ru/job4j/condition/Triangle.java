package ru.job4j.condition;

/**
* Triangle.
*
* @author Vladimir Zhirnov (harabe@yandex.ru)
* @version $Id$
* @since 0.1
*/
public class Triangle {
	/**
	* @param variable 'a' of Point type
	*/
	private Point a;
	/**
	* @param variable 'b' of Point type
	*/
	private Point b;
	/**
	* @param variable 'c' of Point type
	*/
	private Point c;
	/**
	* Triangle.
	* @param a double
	* @param b double
	* @param c double
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	* The method calculate the triangle area.
	* @return absolute value double
	*/
	public double area() {
		return Math.abs(0.5 * ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())));
	}
}