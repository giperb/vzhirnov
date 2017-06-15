package ru.job4j.ru;

/**
 * Programm Board.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 15.06.2017
 */
 public class Board {
 	/**
     * The method draws a board.
     * @param width of the board.
     * @param height of the board.
     * @return drawing the board.
     */
 	public String paint(int width, int height) {
     StringBuilder builder = new StringBuilder();
 		for (int i = 1; i <= height; i++) {
				for (int j = 1; j <= width; j++) {
					if ((i + j) % 2 == 0) {
  						builder.append("x");
  					} else {
 						builder.append(" ");
 					}
 				}
 				builder.append(System.getProperty("line.separator"));
 		}
 		return builder.toString();
 	}
 }