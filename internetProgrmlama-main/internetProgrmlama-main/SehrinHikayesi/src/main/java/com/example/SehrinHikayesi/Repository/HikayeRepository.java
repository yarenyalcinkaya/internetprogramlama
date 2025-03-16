package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Hikaye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HikayeRepository extends JpaRepository<Hikaye, Long> {
    List<Hikaye> findByKullanici_KullaniciId(Long kullaniciId);
    List<Hikaye> findByDurum(String durum);
    List<Hikaye> findByBaslikContaining(String baslik);
    List<Hikaye> findByKonum(String konum);
}