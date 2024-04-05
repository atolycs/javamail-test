
package jp.atolycs;

import java.net.MalformedURLException;
import java.util.ResourceBundle;

import jp.atolycs.DefineLoader;
import jp.atolycs.LogUtil;

public class mSendTest {

    private static final boolean DEBUG = false;

    public static void main(String[] args) throws MalformedURLException {

        LogUtil log = new LogUtil();

        log.info("Loading Define Bootstrapper...");
        ResourceBundle _default = DefineLoader.gen_load("define");

        String Loader_FILE = _default.getString("LOAD_CONFIG");

        log.info("Loading End user... : " + Loader_FILE);

        ResourceBundle _enduser = DefineLoader.user_load(Loader_FILE);

        if (DEBUG) {
            log.debug("Loaded End user define.");
        }


    }
}

