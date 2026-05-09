package com.springSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGenerator {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("Pavan@123"));
	}
}
