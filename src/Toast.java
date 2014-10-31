package cp.plugin.toast;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class Toast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("show")) {
            cordova.getActivity().runOnUiThread(new Runnable(){
                public void run(){
                    android.widget.Toast toast = android.widget.Toast.makeText(webView.getContext(),"king is awesome",android.widget.Toast.LENGTH_SHORT);
                    toast.show();
                    callbackContext.success();
                    return ;
                }
            });
            return true;
        }
        return false;
    }

    private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}