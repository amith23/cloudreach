package com.example.user_hostpots_service.factory.stream;

import com.example.user_hostpots_service.factory.AbstractFactory;

public class StreamFactory<T> implements AbstractFactory<T> {

	@Override
	public T create(String factoryType) {
		if ("AWS".equals(factoryType)) {
			return (T) new KinesisStream();
		}
		return null;
	}

}
