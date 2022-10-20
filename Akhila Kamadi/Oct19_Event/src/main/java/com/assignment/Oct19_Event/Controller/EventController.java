package com.assignment.Oct19_Event.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Oct19_Event.Entity.Event;
import com.assignment.Oct19_Event.Service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/event")
	public List<Event> getEvent(){
		return eventService.findAll();
	}
}
