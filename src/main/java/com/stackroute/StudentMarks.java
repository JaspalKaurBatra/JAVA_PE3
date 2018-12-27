package com.stackroute;

public class StudentMarks {
    public static boolean studentmarks(int grade)

    {
        if(grade<0 && grade>100)
        {
            return true;
        }
        else if(grade<0)
        {
            return false;
        }
        else if(grade>100)
        {
            return false;
        }
        else
            return true;
    }
}
