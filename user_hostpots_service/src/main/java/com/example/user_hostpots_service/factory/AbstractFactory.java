package com.example.user_hostpots_service.factory;

public interface AbstractFactory<T> {
	T create(String producerType);
}
