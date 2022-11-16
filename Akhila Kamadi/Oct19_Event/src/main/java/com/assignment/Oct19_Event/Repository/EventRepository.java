package com.assignment.Oct19_Event.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Oct19_Event.Entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
	
	List<Event> findByEventName(String eventName);
	
	List<Event> findByEventOrganizer(String eventOrganizer);
	
	List<Event> findByEventLocation(String eventLocation);
}
