package com.example.user_hostpots_service.factory.stream;

public interface Stream {
	public Object getProoducer();

	public void produce(String message);
}
