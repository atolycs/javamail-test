
package jp.atolycs;

import java.net.MalformedURLException;
import java.util.ResourceBundle;

import jp.atolycs.DefineLoader;
import jp.atolycs.LogUtil;
import jp.atolycs.atolycs_utils;


public class mSendTest {

    private static final boolean DEBUG = false;

    public static void main(String[] args) throws MalformedURLException {

        atolycs_utils utils = new atolycs_utils();

        utils.bootStrap();

        LogUtil log = new LogUtil();

        log.info("Loading Define Bootstrapper...");
        ResourceBundle _default = DefineLoader.gen_load("define");

        String Loader_FILE = _default.getString("LOAD_CONFIG");

        ResourceBundle _enduser = DefineLoader.user_load(Loader_FILE);

        MailUtil mUtil = new MailUtil(
                _enduser.getString("MTA_SERVER"),
                Integer.parseInt(_enduser.getString("MTA_PORT")),
                _enduser.getString("ENVELOPE_FROM"),
                _default.getString("DRY_RUN"),
                _default.getString("DEFAULT_ENCODE"),
                Integer.parseInt(_default.getString("SEND_TIMEOUT"))
        );

        mUtil.sendMail(
            _enduser.getString("MAIL_FROM"),
            _enduser.getString("MAIL_FROM_NAME"),
            _enduser.getString("MAIL_TO"),
            _enduser.getString("SUBJECT"),
            _enduser.getString("BODY")

        );

    }
}

