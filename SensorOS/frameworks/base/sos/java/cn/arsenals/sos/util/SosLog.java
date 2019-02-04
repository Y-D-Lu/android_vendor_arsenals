package cn.arsenals.sos.util;

import android.os.SystemProperties;

import android.util.Log;

public final class SosLog {

    private final static boolean enabled = "1".equals(SystemProperties.get("ro.debuggable"));

    private static String convertToSosTag(String tag) {
        return "ARSENALS_SOS : " + tag;
    }

    public static void v(String tag, String msg) {
        if(enabled){
            Log.v(convertToSosTag(tag), msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if(enabled){
            Log.v(convertToSosTag(tag), msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if(enabled){
            Log.d(convertToSosTag(tag), msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if(enabled) {
            Log.d(convertToSosTag(tag), msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        Log.i(convertToSosTag(tag), msg);
    }

    public static void i(String tag, String msg, Throwable tr) {
        Log.i(convertToSosTag(tag), msg, tr);
    }

    public static void w(String tag, String msg) {
        Log.w(convertToSosTag(tag), msg);
    }

    public static void w(String tag, String msg, Throwable tr) {
        Log.w(convertToSosTag(tag), msg, tr);
    }

    public static void e(String tag, String msg) {
        Log.e(convertToSosTag(tag), msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        Log.e(convertToSosTag(tag), msg, tr);
    }

    public static void wtf(String tag, String msg) {
        Log.wtf(convertToSosTag(tag), msg);
    }

    public static void wtf(String tag, Throwable tr) {
        Log.wtf(convertToSosTag(tag), tr);
    }

    public static void wtf(String tag, String msg, Throwable tr) {
        Log.wtf(convertToSosTag(tag), msg, tr);
    }
}

