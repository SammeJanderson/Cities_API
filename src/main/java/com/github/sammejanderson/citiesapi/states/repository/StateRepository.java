package com.github.sammejanderson.citiesapi.states.repository;

import com.github.sammejanderson.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {


}
