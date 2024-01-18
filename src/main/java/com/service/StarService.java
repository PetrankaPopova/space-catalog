package com.service;



import com.domain.entity.entity.Star;
import com.domain.entity.entity.enums.StarClass;

import java.util.List;

public interface StarService {
    public void registerStar(String name, StarClass starClass, double mass, double size, int temperature, boolean compatibility);
    List<Star> getAllStar();
    public void registerStar(Star star);

    List<Star> searchStars(String name, StarClass starClass);
}
