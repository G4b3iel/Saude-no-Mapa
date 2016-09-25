package com.mat_brandao.saudeapp.domain.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import timber.log.Timber;

/**
 * Created by Mateus Brandão on 20/09/2016.
 */

public class DateUtil {
    public static String getNowDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
        Timber.i("timeString = " + simpleDateFormat.format(new Date()));
        return simpleDateFormat.format(new Date());
    }
}
