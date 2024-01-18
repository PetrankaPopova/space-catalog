package com.service;



import com.domain.entity.entity.Planet;
import com.domain.entity.entity.enums.PlanetType;

import java.util.List;

public interface PlanetService {
    void registerPlanet(String name, PlanetType type, boolean habitable);
    void registerPlanet(Planet planet);

    List<Planet> getAllPlanet();
}
