package com.example.user_hostpots_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_hostpots_service.paylod.request.Coordinate;
import com.example.user_hostpots_service.stream.StreamService;

@RestController
public class BFFController {
	
	@Autowired
	private StreamService streamService;
	
	@PostMapping("/api/bff/user/{userId}/track")
	Coordinate newUserCoordinate(@RequestBody Coordinate coordinate, @PathVariable String userId) {
		streamService.produce(coordinate.toString());
		return coordinate;
	}
}
