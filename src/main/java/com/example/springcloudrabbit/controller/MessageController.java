package com.example.springcloudrabbit.controller;

import com.example.springcloudrabbit.message.Message;
import com.example.springcloudrabbit.producer.MessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/message")
public class MessageController {

  private final MessageProducer messageProducer;

  @PostMapping
  public ResponseEntity<HttpStatus> sampleQueue(@RequestBody Message message) {
    messageProducer.newMessageProduce(message);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
