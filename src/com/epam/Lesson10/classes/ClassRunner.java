package com.epam.Lesson10.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Natallia_Lahun on 03/23/2017.
 */
public class ClassRunner {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();// не надо все код размещать в единственном main методе)

        File file = new File("src/com/epam/Lesson10/sourcefiles/file.xml");
        StringBuilder sb= new StringBuilder();
        try {

            BufferedReader inputStream = new BufferedReader(new FileReader(file));
            inputStream.readLine();
            String s;
            while ((s = inputStream.readLine()) != null) {
                sb.append(s);
            }
            array = XMLBreakfastMenuParser.parse(sb.toString());
        } catch (IOException e){
            e.printStackTrace();
        }

        for (String str: array) {
            System.out.println(str);
        }

    }
}



