package com.self.kafka.domains;

import java.io.Serializable;

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

	private String fName;
	
	private String lName;
	
	private Integer age;
	
}
