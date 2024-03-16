package com.poleszak.appconsumer.service;

import com.poleszak.appconsumer.model.MessageDTO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageProcessingService {
    private static final Logger logger = LoggerFactory.getLogger(MessageProcessingService.class);

    private final ExcelFileService excelFileService;
    private final EmailService emailService;


    public void processAndSendMessages(List<MessageDTO> messageDTOs) {
        try {
            byte[] fileContent = excelFileService.createExcelFile(messageDTOs);
            emailService.sendEmailWithAttachment(fileContent, "messages.xlsx", "test@mailhog.local", "Your Excel File");
        } catch (Exception e) {
            logger.error("Error during message processing and sending e-mail", e);
        }
    }
}
