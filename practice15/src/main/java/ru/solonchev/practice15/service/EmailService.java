package ru.solonchev.practice15.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.sender.email}")
    private String senderEmail;
    @Value("${spring.mail.sender.text}")
    private String senderText;

    @Async
    public void sendEmail(String receiver, String message) {
        MimeMessagePreparator preparation = mimeMessage -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
            helper.setTo(receiver);
            helper.setSubject("Тестовое сообщение");
            helper.setText(message);
        };
        javaMailSender.send(preparation);
    }
}
