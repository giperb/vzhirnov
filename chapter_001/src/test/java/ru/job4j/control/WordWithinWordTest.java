package ru.job4j.control;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Program WordWithinWordTest.
 *
 * @author Vladimir Zhirnov (mailto:harabe@yandex.ru)
 * @version 0.1
 * @since 16.09.2017
 */
public class WordWithinWordTest {
    /**
     * Testing for method "contains".
     * The method finds that one word is inside another word
     */
    @Test
    public void contains() {
        WordWithinWord wordWithinWord = new WordWithinWord();
        String word = "путешествие";
        String wordCheck = "шест";
        boolean result = wordWithinWord.contains(word, wordCheck);
        assertTrue(result);
    }
}