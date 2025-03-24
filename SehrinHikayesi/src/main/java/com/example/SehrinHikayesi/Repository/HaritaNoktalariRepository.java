package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.HaritaNoktalari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HaritaNoktalariRepository extends JpaRepository<HaritaNoktalari, Long> {
    List<HaritaNoktalari> findByHikaye_HikayeId(Long hikayeId);
}
