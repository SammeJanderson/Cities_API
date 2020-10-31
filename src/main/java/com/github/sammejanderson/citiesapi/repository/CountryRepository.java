package com.github.sammejanderson.citiesapi.repository;

import com.github.sammejanderson.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
