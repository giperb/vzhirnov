package ru.job4j.calculator;

/**
 * Программа Calculator.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {
	/**
	* @param result
	*/
	private double result;
	/**
	* Add (сложение).
	* @param first number
	* @param second number
	*/
	public void add(double first, double second) {
	this.result = first + second;
	}
	/**
	* Subtract (вычитание).
	* @param first число
	* @param second число
	*/
	public void subtract(double first, double second) {
	this.result = first - second;
	}
	/**
	* Div (деление).
	* @param first число
	* @param second число
	*/
	public void div(double first, double second) {
	this.result = first / second;
	}
	/**
	* Multiple (умножение).
	* @param first число
	* @param second число
	*/
	public void multiple(double first, double second) {
	this.result = first * second;
	}
	/**
	* @return число
	*/
	public double getResult() {
	return this.result;
	}
}