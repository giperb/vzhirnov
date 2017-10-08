package ru.job4j.control;

/**
 * Program WordWithinWord.
 *
 * @author Vladimir Zhirnov (mailto:harabe@yandex.ru)
 * @version 0.1
 * @since 16.09.2017
 */
public class WordWithinWord {
        /**
         * The method finds that one word is inside another word.
         * @param origin - string
         * @param sub - string
         * @return true or false
         */
    boolean contains(String origin, String sub) {
        char[] origChar = origin.toCharArray();
        char[] subChar = sub.toCharArray();
        boolean result = false;
        int j = 0;

        for (int i = 0; i < origChar.length && j < subChar.length; i++) {

            if (origChar[i] == subChar[j]) {
                result = true;
                j++;
            } else if (origChar[i] != subChar[j]) {
                result = false;
                j = 0;
            }
        }
        return result;
    }
}
