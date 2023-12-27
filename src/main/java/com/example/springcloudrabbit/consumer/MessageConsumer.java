package com.example.springcloudrabbit.consumer;

import com.example.springcloudrabbit.message.Message;
import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageConsumer {

  @Bean
  public Consumer<Message> sampleMessage() {
    return message -> log.info("Received new message from sample queue: {}", message.getContent());
  }
}
