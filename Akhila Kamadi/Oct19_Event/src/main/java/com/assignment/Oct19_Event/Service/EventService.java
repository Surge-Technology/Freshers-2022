package com.assignment.Oct19_Event.Service;

import java.util.List;

import com.assignment.Oct19_Event.Entity.Event;

public interface EventService {

	List<Event> getAllEvents();
	
	void saveEvent(Event event);
	
	void updateEvent(Event event);
	
	void deleteEvent(long id);
	
	List<Event> getEventByName(String eventName);
	
	List<Event> getEventByLocation(String eventLocation);
	
	List<Event> getEventByOrganizer(String eventOrganizer);
}
