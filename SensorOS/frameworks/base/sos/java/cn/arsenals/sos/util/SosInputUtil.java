package cn.arsenals.sos.util;

import android.hardware.input.InputManager;
import android.view.InputEvent;

public final class SosInputUtil {
    public static final int INJECT_INPUT_EVENT_MODE_ASYNC = 0;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_RESULT = 1;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH = 2;

    public static boolean injectInputEvent(InputEvent event, int displayId, int mode) {
        return InputManager.getInstance().injectInputEventInternal(event, displayId, mode);
    }
}

