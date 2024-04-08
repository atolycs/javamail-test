package jp.atolycs;

import jp.atolycs.LogUtil;

public class atolycs_utils {
    
    private static LogUtil log = new LogUtil();
    private static final String version = "0.1.0";

    public void bootStrap() {
        System.out.println("#######################################");
        System.out.printf("#  JavaMail Test Send Tool ver %s  #\n", version);
        System.out.println("#        Created by Atolycs 2024      #");
        System.out.println("#######################################");


        log.info("Welcome to Test Tool");
    }

}
