package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class VowelTest {

    Vowel vowel = new Vowel();


    @Test
    public void remove()
    {
        String[] result = vowel.removeVowel(new String[]{"India","United States","Germany","Egypt","czechoslovakia"});
        assertArrayEquals(new String[]{"Ind","Untd Stts","Grmny","Egypt","czchslvk"},result);
    }

    @Test
    public void remove1()
    {
        String[] result = vowel.removeVowel(new String[]{"India,United States,Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Ind,Untd Stts,Grmny,Egypt,czchslvk"},result);
    }
    @Test
    public void removeFail()
    {
        String[] result = vowel.removeVowel(new String[]{"India,United States,Germany,Egypt,czechoslovakia"});
        assertArrayEquals(new String[]{"Ind,Untd Stts,Grmny,Egypt,czchslvk"},result);
    }
}
