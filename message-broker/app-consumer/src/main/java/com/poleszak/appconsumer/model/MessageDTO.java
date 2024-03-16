package com.poleszak.appconsumer.model;


import java.io.Serializable;

public record MessageDTO(Long id,
                         String message) implements Serializable {
}

