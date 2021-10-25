package com.labz.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
	public String firstName(String firstName) {	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName);
		if(match.find() && match.group().equals(firstName)) {
        }
		return firstName;
	}
}

	
