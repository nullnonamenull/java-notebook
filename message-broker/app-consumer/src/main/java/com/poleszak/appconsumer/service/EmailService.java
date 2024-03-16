package com.poleszak.appconsumer.service;

import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService {
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);

    private final JavaMailSender mailSender;

    public void sendEmailWithAttachment(byte[] fileContent, String fileName, String to, String subject) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText("Please find the attached file.");
            helper.addAttachment(fileName, new ByteArrayResource(fileContent));

            mailSender.send(message);
        } catch (Exception e) {
            logger.error("Error during sending e-mail", e);
        }
    }
}
