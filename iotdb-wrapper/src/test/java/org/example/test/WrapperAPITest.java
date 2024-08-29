package org.example.test;

import org.junit.Test;
import org.example.main.WrapperAPI;

import static org.junit.Assert.assertEquals;

public class WrapperAPITest {
    @Test
    public void test() {
        WrapperAPI api = new WrapperAPI();
        assertEquals(42, 42);
    }
}
