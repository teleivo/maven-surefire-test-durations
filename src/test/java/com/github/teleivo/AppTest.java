package com.github.teleivo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Before
    public void setUp() throws InterruptedException {
        Thread.sleep(1000 * 30);
    }

    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        Thread.sleep(1000 * 2);
        assertTrue( true );
    }
}
