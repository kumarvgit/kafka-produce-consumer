package com.self.kafka.kafkaconsumer.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController()
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1")
public class PersonController {

	/**
	 * Kafka topic name going by name "sampletopic"
	 */
	private static final String KAFKA_SAMPLE_TOPIC = "sampletopic";

	/**
	 * Lombok and constructor based injection.
	 */
//	private final KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping(path = "/kafka")
	public ResponseEntity<String> postPersonOnTopic() {
		// FIXME - Do we really need the get as it is not going to be one entry
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@KafkaListener(topics = KAFKA_SAMPLE_TOPIC, groupId = "test-consumer-group")
	public void consume(String message) throws IOException {
		log.info("Message received is " + message);
	}

}
