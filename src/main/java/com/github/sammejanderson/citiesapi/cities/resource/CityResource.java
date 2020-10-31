package com.github.sammejanderson.citiesapi.cities.resource;

import com.github.sammejanderson.citiesapi.cities.entities.City;
import com.github.sammejanderson.citiesapi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping
    public Page<City> cities(Pageable page) {
        return cityRepository.findAll(page);
    }


}
