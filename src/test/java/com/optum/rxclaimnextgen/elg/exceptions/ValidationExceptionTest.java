package com.optum.rxclaimnextgen.elg.exceptions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationExceptionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void extendsExceptionClassTest() throws Exception {
        ValidationException validationException = new ValidationException();

        assertTrue(validationException instanceof Exception);
    }

    @Test
    public void defaultConstructor() throws Exception {
        assertNotNull(new ValidationException());
    }

    @Test
    public void constructorWithMessage() throws Exception {
        String expected = "foobar";
        ValidationException validationException = new ValidationException(expected);

        assertEquals(expected, validationException.getMessage());
    }



}