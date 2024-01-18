package com.space.service.impl.impl;
import com.space.service.MoonService;
import com.space.domain.entity.Moon;
import com.space.repository.repository.MoonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoonServiceImpl implements MoonService {
    private final MoonRepository moonRepository;

    @Autowired
    public MoonServiceImpl(MoonRepository moonRepository) {
        this.moonRepository = moonRepository;
    }

    @Override
    public void registerMoon(String name) {
        Moon moon = new Moon();
        moon.setName(name);
        this.moonRepository.save(moon);
    }

    @Override
    public void registerMoon(Moon moon) {
        moonRepository.save(moon);
    }

    @Override
    public List<Moon> getAllMoon() {
        return this.moonRepository.getAllMoon();
    }


}
