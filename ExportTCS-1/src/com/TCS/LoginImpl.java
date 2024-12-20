package com.TCS;

public class LoginImpl implements Login {

	@Override
	public void testLogin(String username, String password) {

		if (username.equals("Indrajit") && password.equals("indra@01")) {

			System.out.println("Login successful..");

		} else {

			System.out.println("Login failed..");
		}

	}

}
