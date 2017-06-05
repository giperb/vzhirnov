 package ru.job4j.loop;
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
 public class CounterTest {
 	/**
 	* Test add.
 	*/
    @Test
    public void testAdd() {
 		Counter count = new Counter();
 		int result = count.add(2, 20);
 		assertThat(result, is(110));
 	}
 }