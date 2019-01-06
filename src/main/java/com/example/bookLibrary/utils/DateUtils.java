package com.example.bookLibrary.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static Date parseDate(String d) {
        try {
            return dateFormat.parse(d);
        } catch (ParseException e) {
            return null;
        }
    }
}
