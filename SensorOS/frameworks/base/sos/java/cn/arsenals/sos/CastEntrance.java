package cn.arsenals.sos;

import android.app.ActivityThread;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

import cn.arsenals.sos.util.SosLog;

import java.util.Arrays;

public final class CastEntrance {
    private static final String TAG = "CastEntrance";
    public static void main(String[] args) {
        SosLog.d(TAG, "CastEntrance.main : " + Arrays.toString(args));
        Looper.prepare();
        Context ctx = ActivityThread.systemMain().getSystemContext();
        Intent intent = new Intent();
        intent.setClassName(SosConstants.SOS_PACKAGE_NAME, SosConstants.Broadcast.RECEIVER_NAME);
        intent.setAction(SosConstants.Broadcast.ACTION);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        intent.putExtra(SosConstants.Broadcast.ARGS, args);
        ctx.sendBroadcast(intent);
        SosLog.d(TAG, "sentBroadcast, intent : " + intent);
        Looper.loop();
    }
}

