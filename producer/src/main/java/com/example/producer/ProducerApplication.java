package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.model.dto.*;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        ItemDto itemDto = new ItemDto();//WHY? for good sake
        SpringApplication.run(ProducerApplication.class, args);
    }

}
