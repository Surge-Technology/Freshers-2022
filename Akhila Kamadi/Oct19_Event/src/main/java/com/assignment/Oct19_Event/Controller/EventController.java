package com.assignment.Oct19_Event.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@GetMapping("/event/getByName/{eventName}")
	public ResponseEntity<List<Event>> getByEventName(@PathVariable String eventName){
		return new ResponseEntity<List<Event>>(eventService.getEventByName(eventName),HttpStatus.OK);
	}
	
	@GetMapping("/event/getByLocation/{eventLocation}")
	public ResponseEntity<List<Event>> getByEventLocation(@PathVariable String eventLocation){
		return new ResponseEntity<List<Event>>(eventService.getEventByLocation(eventLocation),HttpStatus.OK);
	}
	
	@GetMapping("/event/getByOrganizer/{eventOrganizer}")
	public ResponseEntity<List<Event>> getEventByOrganizer(@PathVariable String eventOrganizer){
		return new ResponseEntity<List<Event>>(eventService.getEventByOrganizer(eventOrganizer),HttpStatus.OK);
	}
}
