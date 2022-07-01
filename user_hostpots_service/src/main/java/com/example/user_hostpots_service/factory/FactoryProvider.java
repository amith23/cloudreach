package com.example.user_hostpots_service.factory;

import com.example.user_hostpots_service.factory.stream.StreamFactory;

public class FactoryProvider {
	public static AbstractFactory getFactory(String choice) {

		if ("Stream".equalsIgnoreCase(choice)) {
			return new StreamFactory();
		}

		return null;
	}
}
