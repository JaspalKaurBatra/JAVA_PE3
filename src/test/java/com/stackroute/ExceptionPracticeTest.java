package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionPracticeTest {


    ExceptionPractice exceptionPractice = null;
    @Before
    public void setUp() throws Exception {
        exceptionPractice = new ExceptionPractice("look for the condition of ARRAY INDEX OUT OF BOUND exception");
    }

    @After
    public void tearDown() throws Exception {
        exceptionPractice = null;
    }


    @Test
    public void testMain1(){
        //act
        boolean expected = true;
        //arrange
        boolean result = exceptionPractice.main(new int[]{23,45,65,44});
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testMain2(){
        //act
        boolean expected = false;
        //arrange
        boolean result = exceptionPractice.main(new int[]{23,45,65,44});
        //assert
        assertNotEquals(expected,result);
    }

}