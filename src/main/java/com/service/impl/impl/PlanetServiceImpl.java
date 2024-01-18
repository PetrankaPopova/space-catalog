package com.service.impl.impl;


import com.domain.entity.entity.Planet;
import com.domain.entity.entity.enums.PlanetType;
import com.repository.repository.PlanetRepository;
import com.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService {
    private final PlanetRepository planetRepository;

    @Autowired
    public PlanetServiceImpl(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    public void registerPlanet(String name, PlanetType type, boolean habitable) {
        Planet planet = new Planet();
        planet.setName(name);
        planet.setType(type);
        planet.setHabitable(habitable);
        planetRepository.save(planet);

    }

    @Override
    public void registerPlanet(Planet planet) {
        this.planetRepository.save(planet);
    }

    @Override
    public List<Planet> getAllPlanet() {
        return this.planetRepository.getAllPlanet();
    }
}
