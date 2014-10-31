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
            final String msg = args.getString(0);
            final String pos =  args.getString(1);
            cordova.getActivity().runOnUiThread(new Runnable(){
                public void run(){
                    android.widget.Toast toast = android.widget.Toast.makeText(webView.getContext(),msg,android.widget.Toast.LENGTH_SHORT);
                    if(pos=="top"){
                        toast.setGravity(android.view.Gravity.TOP,0,0);
                    }else if(pos=="center"){
                        toast.setGravity(android.view.Gravity.CENTER,0,0);
                    }else if(pos=="bottom"){
                        toast.setGravity(android.view.Gravity.BOTTOM,0,0);
                    }else {
                        toast.setGravity(android.view.Gravity.CENTER,0,0);
                    }
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