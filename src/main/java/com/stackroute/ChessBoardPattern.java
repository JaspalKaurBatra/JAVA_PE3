package com.stackroute;

import java.io.*;

public class ChessBoardPattern {


    public static int NumberOfRows() {
        int linenumber = 0;
        try {
            File file = new File("Content");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                while (lnr.readLine() != null) {
                    linenumber++;
                }
                System.out.println("Total number of lines : " + linenumber);
                lnr.close();
            } else {
                System.out.println("File does not exists!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linenumber;
    }

    public static boolean CheckWWIsThereORNot(String WW){

        String fileName = "Content";
        BufferedReader br;
        String inputSearch = "WW";
        String line = "";
        Boolean exist = false;


        try {
            br = new BufferedReader(new FileReader(fileName));
            try {
                while ((line = br.readLine()) != null) {
                    if (line.contains(inputSearch)){
                        exist=true;
                    }
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return exist;
    }


    public static boolean ChechPipeIsThereOrNot() {
        String fileName = "Content";
        BufferedReader br;
        String inputSearch = "|";
        String line = "";
        Boolean exist = false;


        try {
            br = new BufferedReader(new FileReader(fileName));
            try {
                while ((line = br.readLine()) != null) {
                    if (line.contains(inputSearch)){
                        exist=true;
                    }
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return exist;

    }
}
}
