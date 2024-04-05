
package jp.atolycs;

class log {

    void stdout(String str) {
        System.out.print(str);
        System.out.println();
    }
}

public class LogUtil extends log {

    public void debug(String str) {
            System.out.println("[ DEBUG ]: ");
            stdout(str);
    }

    public void info(String str) {
        System.out.print("[ INFO ] ");
        super.stdout(str);
    }

    public void error(String str) {
        System.out.print("[ ERROR ] ");
        super.stdout(str);
    }

}