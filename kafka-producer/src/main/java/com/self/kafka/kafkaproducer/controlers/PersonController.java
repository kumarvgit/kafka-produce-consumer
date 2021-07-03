package com.self.kafka.kafkaproducer.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.kafka.domains.PersonModel;

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
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@PostMapping(path = "/kafka")
	public ResponseEntity<Void> postPersonOnTopic(@RequestBody String personModel) {
		log.debug("Received request body as: " + personModel);
		
		kafkaTemplate.send(KAFKA_SAMPLE_TOPIC, personModel);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

}