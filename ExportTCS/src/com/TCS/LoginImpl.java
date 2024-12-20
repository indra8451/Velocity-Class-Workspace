package com.TCS;

public class LoginImpl implements Login {

	@Override
	public void testLogin(String username, String password) {

		if (username.equals("velocity") && password.equals("12345678")) {

			System.out.println("Login successful..");

		} else {

			System.out.println("Login failed..");
		}

	}

}
