package com.space.service;



import com.space.domain.entity.enums.AgeUnit;
import com.space.domain.entity.enums.GalaxyType;
import com.space.domain.entity.Galaxy;

import java.util.List;

public interface GalaxyService {
    void registerGalaxy(String name, GalaxyType type, double age, AgeUnit ageUnit);
    void registerGalaxy(Galaxy galaxy);
    List<Galaxy> getAllGalaxies();

}
