package com.poleszak.appproducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poleszak.appproducer.model.MessageDTO;
import com.poleszak.appproducer.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AppProducerService {

    private static final Logger logger = LoggerFactory.getLogger(AppProducerService.class);

    private final MessageRepository messageRepository;
    private final RabbitTemplate rabbitTemplate;

    public void generateFile() {
        List<MessageDTO> messageDTOs = messageRepository.findAll().stream()
                .map(message -> new MessageDTO(message.getId(), message.getMessage()))
                .collect(Collectors.toList());

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String messagesJson = objectMapper.writeValueAsString(messageDTOs);
            rabbitTemplate.convertAndSend("messagesExchange", "messages.routingKey", messagesJson);
        } catch (JsonProcessingException e) {
            logger.error("Error during message serialization", e);
        }
    }
}
