package jp.atolycs;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.util.concurrent.TimeUnit;


// Original Library
import jp.atolycs.LogUtil;

/**
 * 
 * Test Mail Send Tool for Java
 * @author Atolycs
 * @version 0.1.0
 * 
 */

public class MailUtil {

    private Properties mail_setting = new Properties();
    private LogUtil log = new LogUtil();
    private String mail_encode;
    private Integer sendTimeOut;
    private static Boolean dry_run = true;

    MailUtil(
        String mail_server,
        Integer mail_port,
        String envelope_from,
        String run_mode,
        String encoding,
        Integer timeout
    ) {
        mail_setting.put("mail.smtp.host", mail_server);
        mail_setting.put("mail.smtp.port", mail_port);
        mail_setting.put("mail.smtp.from", envelope_from);
        dry_run = Boolean.parseBoolean(run_mode);
        mail_encode = encoding;
        sendTimeOut = timeout;
    }

    void sendMail(
        String mail_from,
        String mail_from_name,
        String mail_to,
        String Subject,
        String Body
        ) {
        Session session = Session.getDefaultInstance(
            mail_setting, 
            null);

        MimeMessage mms = new MimeMessage(session);

        try {
            mms.setFrom(
                new InternetAddress(
                     mail_from,
                     mail_from_name,
                     mail_encode)
            );

            mms.setSubject(
                MimeUtility.encodeText(
                    Subject,
                    mail_encode,
                    "B")
            );

            mms.setContent(
                "This is test from JavaMail", 
                "text/plain; charset=\"" + mail_encode + "\""
                );
            
            mms.setRecipients(
                Message.RecipientType.TO,
                mail_to
            );

            mms.saveChanges();

            log.info("Mail Raw Data");
            mms.writeTo(System.out);

            System.out.println();


            if (dry_run) {
                log.info("Program is Dry Run Mode.");
                log.info("See you.");
                System.exit(0);
            } else {
                log.info("Sending in " + sendTimeOut + " seconds");
                TimeUnit.SECONDS.sleep(sendTimeOut);
                log.info("Sending Mail To " + mail_to);
                
            }
        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
