package com.github.teleivo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeClass
    public static void setUpOnce() throws InterruptedException {
        Thread.sleep(1000 * 7);
    }

    @Before
    public void setUp() throws InterruptedException {
        Thread.sleep(1000 * 10);
    }

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        Thread.sleep(1000 * 2);
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithTrueAsWell() throws InterruptedException {
        Thread.sleep(1000 * 2);
        assertTrue( true );
    }
}
