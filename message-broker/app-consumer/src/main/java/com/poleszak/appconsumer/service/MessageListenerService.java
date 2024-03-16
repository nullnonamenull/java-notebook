package com.poleszak.appconsumer.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poleszak.appconsumer.model.MessageDTO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageListenerService {
    private static final Logger logger = LoggerFactory.getLogger(MessageListenerService.class);

    private final MessageProcessingService messageProcessingService;


    @RabbitListener(queues = "#{@messagesQueue}")
    public void receiveMessage(String messageJson) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<MessageDTO> messageDTOs = objectMapper.readValue(messageJson, new TypeReference<>() {
            });
            messageProcessingService.processAndSendMessages(messageDTOs);
        } catch (Exception e) {
            logger.error("Error during receiving message from queue", e);
        }
    }
}
