package com.epam.Lesson10.classes;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Natallia_Lahun on 03/23/2017.
 */
public class XMLBreakfastMenuParser {

    public static String pattern = "([^(<\\/?|>|\\r|\\t)]+)";


    public static List<String> parse(String str) throws IOException {
        List<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(pattern);
        Matcher ma = p.matcher(str);
        while(ma.find()){
            String res = ma.group(0).trim();
            if (! res.isEmpty()) {
                list.add(res);
            }
        }
        return list;
    }


}
