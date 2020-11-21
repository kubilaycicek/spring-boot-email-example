package com.kubilaycicek.emaildemo.bootstrap;

import com.kubilaycicek.emaildemo.service.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.io.IOException;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    MailSender mailSender;

    @Override
    public void run(String... args) throws IOException, MessagingException {
        System.out.println("Sending Email...");
        mailSender.sendEmail();
        mailSender.sendEmailWithAttachment();
        System.out.println("Done !");
    }
}
