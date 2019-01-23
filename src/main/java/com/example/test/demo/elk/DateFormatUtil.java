package com.example.test.demo.elk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatUtil {
    private static final String MS_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final SimpleDateFormat indexFormat = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
    private static SimpleDateFormat eightFormat = new SimpleDateFormat(MS_PATTERN, Locale.CHINA);


    /**
     * <br> Description: 时区转换
     * <br> Author:      xwl
     * <br> Date:        2018/11/28 15:02
     *
     * @param dateStr 时区转换
     * @return 0区到8区
     */
    public static String zeroToEight(long time) {
        return eightFormat.format(new Date(time));

    }

    public static String getIndex(long time){
        return indexFormat.format(new Date(time));
    }
}
