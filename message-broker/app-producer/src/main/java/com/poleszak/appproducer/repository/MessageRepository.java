package com.poleszak.appproducer.repository;

import com.poleszak.appproducer.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
