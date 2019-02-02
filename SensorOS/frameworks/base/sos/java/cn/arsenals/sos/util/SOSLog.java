package cn.arsenals.sos.util;

import android.os.SystemProperties;

import android.util.Log;

public final class SOSLog {

    private final static boolean enabled = "1".equals(SystemProperties.get("ro.debuggable"));

    private static String convertToSOSTag(String tag) {
        return "ARSENALS_SOS : " + tag;
    }

    public static void v(String tag, String msg) {
        if(enabled){
            Log.v(convertToSOSTag(tag), msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if(enabled){
            Log.v(convertToSOSTag(tag), msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if(enabled){
            Log.d(convertToSOSTag(tag), msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if(enabled) {
            Log.d(convertToSOSTag(tag), msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        Log.i(convertToSOSTag(tag), msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        Log.i(convertToSOSTag(tag), msg, tr);
    }

    public static void w(String tag, String msg) {
        Log.w(convertToSOSTag(tag), msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        Log.w(convertToSOSTag(tag), msg, tr);
    }

    public static void e(String tag, String msg) {
        Log.e(convertToSOSTag(tag), msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        Log.e(convertToSOSTag(tag), msg, tr);
    }

    public static void wtf(String tag, String msg) {
        Log.wtf(convertToSOSTag(tag), msg);
    }

    public static void wtf(String tag, Throwable tr) {
        Log.wtf(convertToSOSTag(tag), tr);
    }

    public static void wtf(String tag, String msg, Throwable tr) {
        Log.wtf(convertToSOSTag(tag), msg, tr);
    }
}

