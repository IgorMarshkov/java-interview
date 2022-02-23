package com.interview.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTaskTest {

    private LengthOfLongestSubstringTask task;

    @BeforeEach
    void init() {
        task = new LengthOfLongestSubstringTask();
    }

    @Test
    void testStringWithAllUniqueSymbols() {
        // given
        String str = "abcd";

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(4, result);
    }

    @Test
    void testStringWithLargestFromBeginning() {
        // given
        String str = "abcdd";

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(4, result);
    }

    @Test
    void testStringWithLargestInMiddle() {
        // given
        String str = "aabcftdd";

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(6, result);
    }

    @Test
    void testStringWithLargestFromEnd() {
        // given
        String str = "aabd";

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(3, result);
    }

    @Test
    void testEmptyString() {
        // given
        String str = "";

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    void testNullString() {
        // given
        String str = null;

        // when
        int result = task.lengthOfLongestSubstring(str);

        // then
        Assertions.assertEquals(0, result);
    }

}
