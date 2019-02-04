package cn.arsenals.sos;

public class SosConstants {
    public static final String SOS_PACKAGE_NAME = "cn.arsenals.sos";

    public class Broadcast {
        public static final String RECEIVER_NAME = "cn.arsenals.sos.kastro.CastBroadcastReceiver";
        public static final String ACTION = "cn.arsenals.sos.kastro.CAST_START";
        public static final String ARGS = "args";
    }

    public class MagicDisplay {
        public static final String MAGIC_DISPLAY_NAME = "sensor display";
        public static final int WIDTH = 1080;
        public static final int HEIGHT = 1920;
        public static final int DPI = 320;
    }

    public class SensorLauncher {
        public static final String PACKAGE_NAME = "cn.arsenals.sensor_launcher";
        public static final String LAUNCHER_CLASS_NAME = "com.google.android.apps.nexuslauncher.NexusLauncherActivity";
    }
}

