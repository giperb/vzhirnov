package ru.job4j.ru;

/**
 * Programm Paint.
 *
 * @author Vladimir Zhirnov (harabe@yandex.ru)
 * @version 0.1
 * @since 22.06.2017
 */
 public class Paint {
 	/**
     * The method draws a pyramid.
     * @param h of the pyramid.
     * @return all the added characters and strings into a single string.
     */
	public String piramid(int h) {
		StringBuilder builder = new StringBuilder();
			int height = h - 1;
			for (int i = 0, w = 1; i < h; i++, w += 2) {
				for (int  space = height; space > 0; space--) {
					builder.append(" ");
				}
				for (int ch = 1; ch <= w; ch++) {
					builder.append("^");
				}
				for (int space = height; space > 0; space--) {
					builder.append(" ");
				}
				height--;
 				builder.append(System.getProperty("line.separator"));
 		}
 		return builder.toString();
 	}
 }