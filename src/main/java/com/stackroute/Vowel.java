package com.stackroute;

public class Vowel {
    public String[] removeVowel(String str[]) {


        int l = str.length;
        for (int k = 0; k < l; k++) {
            String s1 = str[k];
            String temp = s1.substring(0, 1);
            for (int i = 1; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                    continue;
                temp = temp + c;
            }
            str[k] = temp;
        }

        for (int i = 0; i < l; i++) {
            System.out.println(str[i]);
        }
        return str;
    }
}