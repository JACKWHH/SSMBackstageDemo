package com.wdhcr.tools;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


public class MailUtil {
    /*发送邮件的方法
     *@ to 给谁发
     *@name  给那个用户发
     * @code 要发送的内容
     *
     */

    public static void sendMail(String to, String name,String code)  {
        //获取连接对象，连接到邮箱服务器
        Properties properties = new Properties();
        //获取163邮箱smtp服务器的地址，这里使用的是163的通信协议
        properties.put("mail.smtp.host", "smtp.163.com");
        //是否进行权限验证。
        properties.put("mail.smtp.auth", "true");
        // 设置邮件传输采用的协议smtp
        properties.put("mail.transport.protocol", "smtp");


        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //填写邮箱号和授权码
                return new PasswordAuthentication("163邮箱", "授权码");   邮箱
            }
        });
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //设置发件人
        try {
            message.setFrom(new InternetAddress("邮箱", "物流后台管理系统", "UTF-8")); 邮箱
            //设置收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //设置邮箱主题
            message.setSubject("重置密码");
            //发送的内容
            message.setContent("尊敬的:"+name+"用户，你的重置密码是："+code,"text/html;charset=UTF-8");
            //发送邮件
            Transport.send(message);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
