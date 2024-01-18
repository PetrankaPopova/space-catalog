package com.repository.repository;


import com.domain.entity.entity.Moon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MoonRepository extends JpaRepository<Moon, Long> {
    List<Moon> getAllMoon();
}
