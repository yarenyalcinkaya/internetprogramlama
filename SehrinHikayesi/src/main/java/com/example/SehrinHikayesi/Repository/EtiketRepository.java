package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Etiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtiketRepository extends JpaRepository<Etiket, Long> {
    List<Etiket> findByEtiketAdi(String etiketAdi);
}
