 package ru.job4j.ru;

 import org.junit.Test;

 import static org.hamcrest.core.Is.is;
 import static org.junit.Assert.assertThat;
 /**
  * BoardTest.
  *
  * @author Vladimir Zhirnov (harabe@yandex.ru)
  * @version 0.1
  * @since 15.06.2017
  */
 public class BoardTest {
 /**
  * Test for paint.
  * The tested values 3 and 3
  */
  @Test
 	public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
 		Board board = new Board();
 		String result = board.paint(3, 3);
 		final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %<sx x%<s", line);
        assertThat(result, is(expected));
 	}
 	 /**
  * Test for paint.
  * The tested values 5 and 4
  */
  @Test
 	public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
 		Board board = new Board();
 		String result = board.paint(5, 4);
 		final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %<sx x x%<s x x %<s", line);
        assertThat(result, is(expected));
 	}
 }