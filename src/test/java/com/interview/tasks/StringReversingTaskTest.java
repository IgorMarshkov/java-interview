package com.interview.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringReversingTaskTest {

    private StringReversingTask task;

    @BeforeEach
    void init() {
        task = new StringReversingTask();
    }

    @Test
    void testOrdinaryReversing() {
        // given
        String str = "12345abc";

        // when
        String result = task.reverse(str);

        // then
        Assertions.assertEquals("cba54321", result);
    }

    @Test
    void testEmptyStringReversing() {
        // given
        String str = "";

        // when
        String result = task.reverse(str);

        // then
        Assertions.assertEquals("", result);
    }

    @Test
    void testNullReversing() {
        // given
        String str = null;

        // when
        String result = task.reverse(str);

        // then
        Assertions.assertEquals(null, result);
    }
}
