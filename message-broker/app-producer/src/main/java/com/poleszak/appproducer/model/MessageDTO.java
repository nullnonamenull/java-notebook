package com.poleszak.appproducer.model;


import java.io.Serializable;

public record MessageDTO(Long id,
                         String message) implements Serializable {
}

