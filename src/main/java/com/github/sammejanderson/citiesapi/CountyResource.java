package com.github.sammejanderson.citiesapi;

import com.github.sammejanderson.citiesapi.countries.Country;
import com.github.sammejanderson.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountyResource {

    private CountryRepository repository;

    @GetMapping
    public List<Country> countries(){
            return repository.findAll();
        }
}
