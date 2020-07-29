package com.munjie.vue.myblog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: munjie
 * @Date: 7/28/2020 23:51
 * @Description:
 */
public class DateUtil {


        public static String getId() {
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("YYYYMMddhhmmssSSS");
            String dateString = formatter.format(currentTime);
            return dateString;
        }

    public static String getDateNow() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd hh:mm");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

}
