package com.service;



import com.domain.entity.entity.Galaxy;
import com.domain.entity.entity.enums.AgeUnit;
import com.domain.entity.entity.enums.GalaxyType;

import java.util.List;

public interface GalaxyService {
    void registerGalaxy(String name, GalaxyType type, double age, AgeUnit ageUnit);
    void registerGalaxy(Galaxy galaxy);
    List<Galaxy> getAllGalaxies();

}
