package com.consumer.email.notification.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.appsdeveloperblog.ws.shared.event.ProductCreationEvent;

@Component
@KafkaListener(topics = "product-creation-event-topic")
public class ProductEvenCreatedHandler {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@KafkaHandler
	public void handle(ProductCreationEvent event) {
		log.info("Incoming message for: key-{} name -{}", event.getProductId(), event.getName());

	}

}
