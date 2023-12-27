package com.example.springcloudrabbit.producer;

import com.example.springcloudrabbit.message.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageProducer {

  private final StreamBridge streamBridge;

  public void newMessageProduce(Message message) {
    streamBridge.send("sampleMessageProducer-out-0", message);
    log.info("Produced new message to sample queue: {}", message.getContent());
  }
}
