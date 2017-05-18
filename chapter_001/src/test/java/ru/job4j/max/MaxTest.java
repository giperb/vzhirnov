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
 		Max maxValue = new Max();
 		int result = maxValue.max(2, 1);
 		assertThat(result, is(2));
 	}
 	/**
 	* Test2 add.
 	*/
 	@Test
 	public void testMaxValue2() {
 		Max maxValue2 = new Max();
 		int result2 = maxValue2.max(3, 2, 1);
		assertThat(result2, is(3));
 	}
 }