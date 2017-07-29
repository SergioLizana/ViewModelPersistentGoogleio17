package riviasoftware.viewmodelgoogleio17;

import android.util.Log;

/**
 * Created by sergiolizanamontero on 29/7/17.
 */

public class ClickLoggingInterceptor {
    private static final String LOG_TAG = ClickLoggingInterceptor.class.getSimpleName();

    public void intercept(int clickCount) {
        Log.d(LOG_TAG, "processed click " + clickCount);
    }
}