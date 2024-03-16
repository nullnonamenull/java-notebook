package com.poleszak.appproducer.controller;

import com.poleszak.appproducer.service.AppProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/app-producer")
public class AppProducerController {

    private final AppProducerService appProducerService;


    @PostMapping("/generate/xlsx")
    public void generateFile() {
        appProducerService.generateFile();
    }
}
