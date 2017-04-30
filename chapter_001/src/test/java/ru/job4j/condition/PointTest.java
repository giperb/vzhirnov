 package ru.job4j.condition;

 import org.junit.Test;
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 /**
 * PointTest.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class PointTest {
 	/**
 	* Test true.
 	*/
    @Test
    public void whenIsTrue() {
 		Point points = new Point(4, 9);
 		boolean result = points.is(2, 1);
 		boolean expected = true;
 		assertThat(result, is(expected));
 	}
 	/**
 	* Test false.
 	*/
    @Test
    public void whenIsFalse() {
 		Point points = new Point(2, 7);
 		boolean result = points.is(1, 3);
 		boolean expected = false;
 		assertThat(result, is(expected));
 	}
 }