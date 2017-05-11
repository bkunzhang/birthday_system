package com.tyb.util;

import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailUtils {
	static Logger logger =  Logger.getLogger(MailUtils.class.getName());
	private MailUtils(){}
	/**
	 * 邮件发送
	 * @param acceptUser 邮件接收者
	 * @param title  邮件主题
	 * @param content 邮件内容
	 * @throws Exception 
	 */
	public static void sendEmail(String acceptUser, String title, String content) throws Exception {
		Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.qq.com");
        props.put("mail.smtp.port", "587");//使用465或587端口
        props.put("mail.smtp.auth", "true");//设置使用验证
        props.put("mail.smtp.starttls.enable","true");//使用 STARTTLS安全连接
        try {
            PopupAuthenticator auth = new PopupAuthenticator();
            Session session = Session.getInstance(props, auth);
            //session.setDebug(true);//打印Debug信息
            MimeMessage message = new MimeMessage(session);
            Address addressFrom = new InternetAddress(PopupAuthenticator.mailUser + "@foxmail.com", "北辰生日录提醒");//第一个参数为发送方电子邮箱地址；第二个参数为发送方邮箱地址的标签
            Address addressTo = new InternetAddress(acceptUser, "主人");//第一个参数为接收方电子邮箱地址；第二个参数为接收方邮箱地址的标签
            message.setSubject(title);
            message.setText(content);
            message.setFrom(addressFrom);
            message.addRecipient(Message.RecipientType.TO, addressTo);
            message.saveChanges();
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.qq.com", PopupAuthenticator.mailUser, PopupAuthenticator.password);
            Transport.send(message);
            transport.close();
            LogCommonUtil.INFO.info("发送成功");
        } catch (Exception e) {
        	LogCommonUtil.ERROR.error("发送失败"+e.getMessage());
            throw e;
        }
	
	}    public static void main(String[] args) throws Exception {
		MailUtils.sendEmail("787225863@qq.com", "1213", "此邮件为北辰生日系统测试发送");
	}
}

/**
 * 身份验证类(也可以不使用此类，直接设置Properties，并获取session)
 * @author 北辰不落雪
 *
 */
class PopupAuthenticator extends Authenticator {
    public static String mailUser; //发送方邮箱'@'符号前的内容:787225863@qq.com
    public static String password; //成功开启IMAP/SMTP服务，在第三方客户端登录时，腾讯提供的密码。注意不是邮箱密码
    static{
    	mailUser = "polarisnosnow";
    	password = "slokciwlguhobbie";
    }
    
    /**
     * 必须要重写，查看源头会发现会通过反射获取相关信息
     */
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(mailUser, password);
    }
    
}
