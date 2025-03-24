package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KullaniciRepository extends JpaRepository<Kullanici, Long> {
    Optional<Kullanici> findByKullaniciEmail(String kullaniciEmail);
    Optional<Kullanici> findByKullaniciAd(String kullaniciAd);
}
