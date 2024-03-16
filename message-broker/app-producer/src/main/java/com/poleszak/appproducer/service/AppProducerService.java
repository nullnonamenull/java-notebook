package com.poleszak.appproducer.service;

import com.poleszak.appproducer.model.MessageDTO;
import com.poleszak.appproducer.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppProducerService {

    private final MessageRepository messageRepository;
    private final RabbitTemplate rabbitTemplate;

    public void generateFile() {
        List<MessageDTO> messageDTOs = messageRepository.findAll().stream()
                .map(message -> new MessageDTO(message.getId(), message.getMessage()))
                .toList();

        rabbitTemplate.convertAndSend("messagesExchange", "messages.routingKey", messageDTOs);
    }
}
