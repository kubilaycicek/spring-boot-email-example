package com.kubilaycicek.emaildemo.service;

import javax.mail.MessagingException;
import java.io.IOException;

public interface MailSender {
    void sendEmail();
    void sendEmailWithAttachment() throws MessagingException, IOException;
}
