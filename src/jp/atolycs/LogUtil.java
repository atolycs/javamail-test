
package jp.atolycs;

import java.text.SimpleDateFormat;
import java.util.Date;

class log {

    void stdout(String str) {
        System.out.print(str);
        System.out.println();
    }
}

public class LogUtil extends log {

    SimpleDateFormat date_format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public void debug(String str) {
        System.out.println("[ " + date_format.format(new Date()) + " ] [ DEBUG ]: ");
        super.stdout(str);
    }

    public void info(String str) {
        System.out.print("[ " + date_format.format(new Date()) + " ] [ INFO ] ");
        super.stdout(str);
    }

    public void error(String str) {
        System.out.print("[ " + date_format.format(new Date()) + " ] [ ERROR ] ");
        super.stdout(str);
    }

}