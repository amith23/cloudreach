package com.example.user_hostpots_service.stream.impl;

import org.springframework.stereotype.Service;

import com.example.user_hostpots_service.factory.FactoryProvider;
import com.example.user_hostpots_service.factory.stream.Stream;
import com.example.user_hostpots_service.factory.stream.StreamFactory;
import com.example.user_hostpots_service.stream.StreamService;

@Service
public class StreamServiceImpl<T> implements StreamService {

	private StreamFactory<T> streamFactory;
	private Stream stream;

	public StreamServiceImpl() {
		streamFactory = (StreamFactory<T>) FactoryProvider.getFactory("Stream");
		this.stream = (Stream) streamFactory.create("AWS");//this should be passed as a env variable
		this.stream.getProoducer();
	}

	@Override
	public void produce(String message) {
		this.stream.produce(message);
	}

}
