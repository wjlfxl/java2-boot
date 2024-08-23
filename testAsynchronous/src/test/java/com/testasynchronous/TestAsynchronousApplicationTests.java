package com.testasynchronous;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.xml.soap.MimeHeader;
import java.io.File;

@SpringBootTest
class TestAsynchronousApplicationTests {

//    @Autowired
//    JavaMailSenderImpl mailSender;
//    @Test
//    void contextLoads() {
//
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        mailMessage.setSubject("你好");
//        mailMessage.setText("werfsfgasrrfgaseftrffasedfawsfg");
//        mailMessage.setTo("3154737677@qq.com");
//        mailMessage.setFrom("1261083341@qq.com");
//        mailSender.send(mailMessage);
//    }
//
//    @Test
//    public void test() throws MessagingException {
//        //复杂邮件
////        MailMessage mailMessage = new MailMessage(); 还有下面两种方式
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        //组装
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
//
//        helper.setSubject("你好");
//        helper.setText("<p style='color:red'>我在工作之余还能坚持写博客</p>");
//
//        //附件
//        helper.addAttachment("1.png",new File("C:\\Users\\admin\\Desktop\\data\\1.png"));
//        helper.addAttachment("2.png",new File("C:\\Users\\admin\\Desktop\\data\\2.png"));
//
//        helper.setTo("3154737677@qq.com");
//        helper.setFrom("1261083341@qq.com");
//
//        mailSender.send(mimeMessage);
//    }


    /**
     *
     * @param flag
     * @param subject
     * @param text
     * @throws MessagingException
     * @Author wjl
     */
//    //封装
//    @Test
//    public void mailSender(boolean flag,String subject,String text) throws MessagingException {
//        //复杂邮件
////        MailMessage mailMessage = new MailMessage(); 还有下面两种方式
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        //组装
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,flag);
//
//        helper.setSubject(subject);
//        helper.setText(text,true);  //"<p style='color:red'>我在工作之余还能坚持写博客</p>"
//
//        //附件
//        helper.addAttachment("1.png",new File("C:\\Users\\admin\\Desktop\\data\\1.png"));
//        helper.addAttachment("2.png",new File("C:\\Users\\admin\\Desktop\\data\\2.png"));
//
//        helper.setTo("3154737677@qq.com");
//        helper.setFrom("1261083341@qq.com");
//
//        mailSender.send(mimeMessage);
//    }

}
