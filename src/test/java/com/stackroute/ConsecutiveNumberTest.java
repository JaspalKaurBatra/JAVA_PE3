package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConsecutiveNumberTest {

    ConsecutiveNumber consecutiveNumber = null;

    @Before
    public void setUp(){
        consecutiveNumber = new ConsecutiveNumber();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumber = null;
    }

    @Test
    public  void testCheckConsecutiveNumber1(){
        //act
        java.lang.String expected = "non consecutive number";

        //arrange
        java.lang.String result = consecutiveNumber.checkConsecutiveNumber("98 96 95 94 93");

        //assert
        assertEquals(expected,result);
    }

    @Test
    public  void testCheckConsecutiveNumber2(){
        //act
        java.lang.String expected = "consecutive number";

        //arrange
        String result = consecutiveNumber.checkConsecutiveNumber("54 53 52 51 50 49 48");

        //assert
        assertEquals(expected,result);
    }

    @Test
    public  void testCheckConsecutiveNumber3(){
        //act
        java.lang.String expected = "non consecutive number";

        //arrange
        String result = consecutiveNumber.checkConsecutiveNumber("1 2 3 4 5 6 6");

        //assert
        assertEquals(expected,result);
    }


}
