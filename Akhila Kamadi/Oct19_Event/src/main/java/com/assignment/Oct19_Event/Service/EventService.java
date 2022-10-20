package com.assignment.Oct19_Event.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Oct19_Event.Entity.Event;
import com.assignment.Oct19_Event.Repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<Event> findAll() {
		return eventRepository.findAll();
	}

}
