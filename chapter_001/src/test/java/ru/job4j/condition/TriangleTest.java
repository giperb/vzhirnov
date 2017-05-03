package ru.job4j.condition;

 import org.junit.Test;
 import static org.junit.Assert.assertThat;
 import static org.hamcrest.number.IsCloseTo.closeTo;

 /**
 * TriangleTest.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class TriangleTest {
  	/**
 	* Test area.
 	*/
    @Test
 	public void testTriangle() {
 		Point pointA = new Point(2, 4);
 		Point pointB = new Point(8, 6);
 		Point pointC = new Point(4, 0);
 		Triangle points = new Triangle(pointA, pointB, pointC);
 		double result = points.area();
 		double expected = 14;
 		assertThat(result, closeTo(expected, 0.01));
 	}
 }
