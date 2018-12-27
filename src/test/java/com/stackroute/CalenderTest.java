package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalenderTest {
    @Test
    public void caltest()
    {
        Calender calender = new Calender();
        assertEquals("First day of the week:Monday 24/12/2018 Last day of week:30/12/2018",calender.dateofweek("dd/MM/YYYY"));
    }
    @Test
    public void caltest1()
    {
        Calender calender = new Calender();
        assertNotEquals("First day of the week:Monday 24/12/2015 Last day of week:30/12/2015",calender.dateofweek("dd/MM/YYYY"));
    }
}
