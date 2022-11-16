package com.assignment.Oct19_Event.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Oct19_Event.Entity.Event;
import com.assignment.Oct19_Event.Repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> getAllEvents() {
		return eventRepository.findAll();
	}
	
	public void saveEvent(Event event) {
		eventRepository.save(event);//here id is null
	}
	
	public void updateEvent(Event event) {
		eventRepository.save(event);//here id is present -> not null
	}

	public void deleteEvent(long id) {
		eventRepository.deleteById(id);
	}
	
	public List<Event> getEventByName(String eventName) {
		return eventRepository.findByEventName(eventName);
	}
	
	public List<Event> getEventByLocation(String eventLocation) {
		return eventRepository.findByEventLocation(eventLocation);
	}
	
	public List<Event> getEventByOrganizer(String eventOrganizer) {
		return eventRepository.findByEventOrganizer(eventOrganizer);
	}
}
