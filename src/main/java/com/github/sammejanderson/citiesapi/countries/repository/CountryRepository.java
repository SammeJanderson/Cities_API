package com.github.sammejanderson.citiesapi.countries.repository;

import com.github.sammejanderson.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
