package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Program ArrayDuplicateTest.
 *
 * @author Vladimir Zhirnov (mailto:harabe@yandex.ru)
 * @since 26.07.2017
 * @version 0.1
 */
 public class ArrayDuplicateTest {
 	/**
 	 * Testing for method remove.
 	 * The method remove duplivates from the array
 	 */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] transmittedArray = {"Привет", "Мир", "Привет", "Супер", "Мир", "ОК", "Мир"};
 		String[] resultArray = duplicate.remove(transmittedArray);
 		String[] expectedArray = {"Привет", "Мир", "ОК", "Супер"};
 		assertThat(resultArray, is(expectedArray));
    }
}