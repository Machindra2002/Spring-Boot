package mypackage.controller;

import mypackage.model.*;
import mypackage.services.*;
import mypackage.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;;


@RestController
public class StateCityController {

	@Autowired 
	StateCityService service;
	
	@PostMapping("api/statecity")
	public State AddStateCity(@RequestBody State st) {
		return service.AddStateCityData(st);
	}
	
	@GetMapping("api/statecity")
	public List<State>AllStateCity() {
		return service.GetStates();
	}
}
