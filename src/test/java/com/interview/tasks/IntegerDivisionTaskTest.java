package com.interview.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerDivisionTaskTest {

    private IntegerDivisionTask task;

    @BeforeEach
    void init() {
        task = new IntegerDivisionTask();
    }

    @Test
    void testDivision() {
        Assertions.assertEquals(10/3, task.divide(10, 3));
        Assertions.assertEquals(10/2, task.divide(10, 2));
        Assertions.assertEquals(-4/2, task.divide(-4, 2));
        Assertions.assertEquals(0/2, task.divide(0, 2));
        Assertions.assertEquals(-4/-2, task.divide(-4, -2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> task.divide(2, 0));
    }
}
