package com.assignment.Oct19_Event.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="event_date")
	private LocalDate eventDate;
	
	@Column(name="event_start_time")
	private LocalTime eventStartTime;
	
	@Column(name="event_end_time")
	private LocalTime eventEndTime;
	
	@Column(name="event_organizer")
	private String eventOrganizer;
	
	@Column(name="event_location")
	private String eventLocation;

	public Event() {
		
	}

	public Event(Long id, String eventName, LocalDate eventDate, LocalTime eventStartTime, LocalTime eventEndTime,
			String eventOrganizer, String eventLocation) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventStartTime = eventStartTime;
		this.eventEndTime = eventEndTime;
		this.eventOrganizer = eventOrganizer;
		this.eventLocation = eventLocation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public LocalTime getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(LocalTime eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public LocalTime getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(LocalTime eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public String getEventOrganizer() {
		return eventOrganizer;
	}

	public void setEventOrganizer(String eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	
	
}
