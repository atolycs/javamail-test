
package jp.atolycs;


import java.util.Locale;

// import javax.mail.Message;
// import javax.mail.MessagingException;
// import javax.mail.Session;
// import javax.mail.Address;
// import javax.mail.Transport;
// import javax.mail.Quota.Resource;
// import javax.mail.internet.InternetAddress;
// import javax.mail.internet.MimeMessage;
// import javax.mail.internet.MimeUtility;

// Resouce Bundler
// import java.util.Properties;
import java.util.ResourceBundle;

// Date Formatter

// import java.text.SimpleDateFormat;
// import java.util.Date;
import java.io.File;
// import java.io.IOException;
// import java.io.InputStream;

// Encode exception
// import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;

public class mSendTest {

    public static void main(String[] args) throws MalformedURLException {

        File dicDir = Paths.get(".\\res").toFile();
        URLClassLoader urlLoader = new URLClassLoader(new URL[]{
            dicDir.toURI().toURL()
        });
        ResourceBundle rb = ResourceBundle.getBundle("define", Locale.getDefault(), urlLoader);

        String mFrom = rb.getString("MAIL_FROM");

        System.out.println(System.getProperty("java.class.path"));
        System.out.println(mFrom);
    }
}

