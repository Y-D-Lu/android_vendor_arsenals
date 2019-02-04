package cn.arsenals.sos;

import android.app.ActivityThread;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;

public final class CastEntrance {
    public static void main(String[] args) {
        Looper.prepare();
        Context ctx = ActivityThread.systemMain().getSystemContext();
        Intent intent = new Intent();
        intent.setClassName(SosConstants.SOS_PACKAGE_NAME, SosConstants.Broadcast.RECEIVER_NAME);
        intent.setAction(SosConstants.Broadcast.ACTION);
        intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
        intent.putExtra(SosConstants.Broadcast.ARGS, args);
        ctx.sendBroadcast(intent);
        Looper.loop();
    }
}

