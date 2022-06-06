package com.javatest.app.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.javatest.app.DTO.UserDTO;

@Service
public class UserService {

	public UserDTO getDetails(UserDTO userDTO) {
		return getCharCount(userDTO);
	}

	public UserDTO getCharCount(UserDTO userDTO) {
		int count = 0;
		int totalCount = 0;
		String input = userDTO.getInput().replaceAll("[^A-Za-z]+", "");
		List<Character> characters = new ArrayList<>();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == letter) {
					count++;
				}
			}
			if (count > 0) {
				characters.add(letter);
				totalCount = totalCount + count;
				count = 0;
			}	
		}
		 char[] letters = input.toCharArray();
	        for(int i = letters.length -1; i >= 0; i--){
	            System.out.print(letters[i]);
	        }
	        Arrays.sort(letters);
	    
		userDTO.setOutput1(characters.stream().sorted().collect(Collectors.toList()));
		userDTO.setOutput2(letters);
		userDTO.setTotalChar(totalCount);
		return userDTO;
	}
}
