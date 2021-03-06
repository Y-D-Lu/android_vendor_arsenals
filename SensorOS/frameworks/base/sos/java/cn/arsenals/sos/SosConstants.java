package cn.arsenals.sos;

public class SosConstants {
    public static final String SOS_PACKAGE_NAME = "cn.arsenals.sos";

    public class Broadcast {
        public static final String RECEIVER_NAME = "cn.arsenals.sos.cast.CastBroadcastReceiver";
        public static final String ACTION = "cn.arsenals.sos.cast.CAST_START";
        public static final String ARGS = "args";
    }

    public class MagicDisplay {
        public static final String MAGIC_DISPLAY_NAME = "sensor display";
    }

    public class SensorLauncher {
        public static final String PACKAGE_NAME = "cn.arsenals.sensor_launcher";
        public static final String LAUNCHER_CLASS_NAME = "com.google.android.apps.nexuslauncher.NexusLauncherActivity";
    }
}

