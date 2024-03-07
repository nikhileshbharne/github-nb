package com.example.fn;

import com.fnproject.fn.testing.*;
import org.junit.*;

import static org.junit.Assert.*;
public class SampleFunctionTest {

    @Rule
    public final FnTestingRule testing = FnTestingRule.createDefault();

    @Test
    public void shouldReturnGreeting() {
        testing.givenEvent().enqueue();
        testing.thenRun(SampleFunction.class, "sampleMethod");

        FnResult result = testing.getOnlyResult();
        assertEquals("Goodmorning, world!", result.getBodyAsString());
    }

}