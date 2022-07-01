package com.example.user_hostpots_service.hateoas;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.example.user_hostpots_service.controllers.BFFController;
import com.example.user_hostpots_service.paylod.request.Coordinate;

@Component
public class CoordinateModelAssembler implements RepresentationModelAssembler<Coordinate,EntityModel<Coordinate>> {

	@Override
	public EntityModel<Coordinate> toModel(Coordinate entity) {
		// TODO Auto-generated method stub
		return null;
		//return EntityModel.of(entity, //
		//        linkTo(methodOn(BFFController.class).withSelfRel(),
		//        linkTo(methodOn(Controller.class).all()).withRel("employees"));;
	}

}
