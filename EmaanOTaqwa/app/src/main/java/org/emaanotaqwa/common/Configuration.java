package org.emaanotaqwa.common;

import java.util.Calendar;

/**
 * Created by Junaid on 10/11/2016.
 */
public class Configuration {
    public static  int pageNumbers[] = new int[]{23, 20, 20, 20, 16, 20, 23};
    public static int getImageCount(Calendar date) {
        return pageNumbers[getDay(date)];
    }
    public static String getDayPrefix(Calendar date) {
        return "img_"+getDay(date)+"_";
    }
    public static int getTotalPages() {
        int sum = 0;
        for(int pages : pageNumbers)
            sum += pages;
        return sum;
    }
    private static int getDay(Calendar date) {
        return (date.get(Calendar.DAY_OF_WEEK)+2)%7;
    }
}
