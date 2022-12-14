package com.example.h1emubootcms.filter;

public class FilterChar {
    public static String filter(String chars){
        chars = chars.replaceAll("[^(a-zA-Z0-9\\u4e00-\\u9fa5)]", "");
        return chars;
    }


}
