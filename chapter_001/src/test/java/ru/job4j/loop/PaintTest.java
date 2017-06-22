 package ru.job4j.ru;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 /**
  * PaintTest.
  *
  * @author Vladimir Zhirnov (harabe@yandex.ru)
  * @version 0.1
  * @since 22.06.2017
  */
 public class PaintTest {
 /**
  * Test for piramid.
  * The tested values 2
  */
  @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^%<s", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
 /**
  * Test for piramid.
  * The tested values 3
  */
  @Test
 	public void whenPiramidWithHeightThreeThenStringThreeRows() {
 		Paint paint = new Paint();
 		String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %<s^^^^^%<s", System.getProperty("line.separator"));
        assertThat(result, is(expected));
 	}
 }