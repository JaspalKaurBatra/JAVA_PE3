package com.stackroute;

/*Write a program to create a ChessBoard pattern with the help of multidimensional array,
 where WWrepresents white color and BB represents Black color.

        Output:

        My Chess Board

        WW|BB|WW|BB|WW|BB|WW|BB|

        BB|WW|BB|WW|BB|WW|BB|WW|

        WW|BB|WW|BB|WW|BB|WW|BB|

        BB|WW|BB|WW|BB|WW|BB|WW|

        WW|BB|WW|BB|WW|BB|WW|BB|

        BB|WW|BB|WW|BB|WW|BB|WW|

        WW|BB|WW|BB|WW|BB|WW|BB|

        BB|WW|BB|WW|BB|WW|BB|WW|*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {

    private static ChessPattern chess;

    @Before
    public void setUp() throws Exception {
        chess = new ChessPattern();
    }

    @After
    public void tearDown() throws Exception {
        chess = null;
    }

    @Test
    public void test1(){
        String[][] arr={{"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"}};

        assertEquals(arr,chess.ChessBoard());
    }

    @Test
    public void test2(){
        String[][] arr={{"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|BB|WW"},
                {"WW|BB|WW|BB|WW|BB|WW|BB|"}};


        assertNotEquals(arr,chess.ChessBoard());
    }

    @Test
    public void test3(){
        String[][] arr={
                {"BB|WW|BB|WW|BB|WW|"},
                {"WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|"},
                {"WW|BB|WW|BB|WW|BB|"},
                {"BB|WW|BB|WW|BB|WW|"}};

        assertNotEquals(arr,chess.ChessBoard());
    }
}