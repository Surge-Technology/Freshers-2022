package com.assignment.Oct19_Event.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Oct19_Event.Entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
