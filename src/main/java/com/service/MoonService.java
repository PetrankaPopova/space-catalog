package com.service;



import com.domain.entity.entity.Moon;

import java.util.List;

public interface MoonService {
    void registerMoon(String name);
    void registerMoon(Moon moon);

    List<Moon> getAllMoon();
}
