package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YorumRepository extends JpaRepository<Yorum, Long> {
    List<Yorum> findByHikaye_HikayeId(Long hikayeId);
    List<Yorum> findByKullanici_KullaniciId(Long kullaniciId);
}
