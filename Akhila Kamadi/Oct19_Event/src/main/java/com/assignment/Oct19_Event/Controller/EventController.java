package com.assignment.Oct19_Event.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Oct19_Event.Entity.Event;
import com.assignment.Oct19_Event.Service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/event")
	public List<Event> getEvent(){
		return eventService.getAllEvents();
	}
	
	@PostMapping("/event/insert")
	public void insertEvent(@RequestBody Event event) {
		eventService.saveEvent(event);
	}
	
	@PutMapping("/event/update")
	public void updateEvent(@RequestBody Event event) {
		eventService.saveEvent(event);
	}
	
	@DeleteMapping("/event/delete/{id}")
	public void deleteEvent(@PathVariable Long id) {
		eventService.deleteEvent(id);
	}
}
