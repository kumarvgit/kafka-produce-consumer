package com.self.kafka.domains;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString(callSuper = false)
@RequiredArgsConstructor
@AllArgsConstructor
public class PersonModel implements Serializable {

	/**
	 * Generated Serial Version UID
	 */
	private static final long serialVersionUID = 1401677564230712415L;

	@JsonProperty(value = "fName")
	private String fName;
	
	@JsonProperty(value = "lName")
	private String lName;
	
	@JsonProperty(value = "age")
	private Integer age;
	
}
