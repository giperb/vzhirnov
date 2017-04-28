 package ru.job4j.max;
 
 import org.junit.Test;
 
 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 
 /**
 * Test.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
 public class MaxTest {
 	/**
 	* Test add.
 	*/
    @Test
    public void testMaxValue() {
 		Max maxValueOne = new Max();
 		int result = maxValue.max(2, 1);
 		assertThat(result, is(2));
 	}
 }