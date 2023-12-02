package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testlevenshteinDistance() {
        int resultest = 1;
        assertEquals(resultest, StringUtils.levenshteinDistance("chat","chats"));
        assertEquals(resultest, StringUtils.levenshteinDistance("chats","chat"));
        assertEquals(resultest, StringUtils.levenshteinDistance("machins","machine"));
        assertEquals(resultest, StringUtils.levenshteinDistance("aviron","avion"));
        assertEquals(resultest, StringUtils.levenshteinDistance("distance","instance"));
        assertEquals(resultest, StringUtils.levenshteinDistance("Chien","Chine"));

    }
}