package com.javatest.app.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserDTO {

	private String input;
	private List<Character> output1;
	private char[] output2;
	private int totalChar;
}
