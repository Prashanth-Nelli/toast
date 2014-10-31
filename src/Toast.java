package cp.plugin.toast;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
    
}