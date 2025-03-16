package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Begeniler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BegenilerRepository extends JpaRepository<Begeniler, Long> {
    List<Begeniler> findByHikaye_HikayeId(Long hikayeId);
    List<Begeniler> findByKullanici_KullaniciId(Long kullaniciId);
}
