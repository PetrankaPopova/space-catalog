package com.space.service;



import com.space.domain.entity.Planet;
import com.space.domain.entity.enums.PlanetType;

import java.util.List;

public interface PlanetService {
    void registerPlanet(String name, PlanetType type, boolean habitable);
    void registerPlanet(Planet planet);

    List<Planet> getAllPlanet();
}
