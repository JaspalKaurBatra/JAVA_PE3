package com.stackroute;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks marks = new StudentMarks();

    @Test
    public void test1() {
        assertEquals("Grade should be between 0 to 100",true, StudentMarks.studentmarks(00));

    }
    @Test
    public void test2() {
        assertEquals("Grade is in between 0 and 100",true, StudentMarks.studentmarks(25));

    }

    @Test
    public void test3() {
        assertEquals(  "grade should be between 0 to 100", false, StudentMarks.studentmarks(200));
    }

    @Test
    public void test4() {
        assertNotEquals("grade should be equal to 0 to 100", true, StudentMarks.studentmarks(450));
    }


    }







