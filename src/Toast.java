package org.apache.cordova.toast;

import android.view.Gravity;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;


public class Toast extends CordovaPlugin {

   @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if ("show".equals(action)) {
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    android.widget.Toast toast = android.widget.Toast.makeText(webView.getContext(),"king is awesome",android.widget.Toast.LENGTH_LONG);
                    toast.show();
                    callbackContext.success();
                    return ;
                }
            });
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }

}