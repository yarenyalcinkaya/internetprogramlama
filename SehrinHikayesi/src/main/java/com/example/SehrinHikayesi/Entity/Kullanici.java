package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "kullanicilar")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kullanici_id")
    private Long kullaniciId;

    @Column(name = "kullanici_ad", nullable = false)
    private String kullaniciAd;

    @Column(name = "kullanici_email", nullable = false, unique = true)
    private String kullaniciEmail;

    @Column(name = "kullanici_sifre", nullable = false)
    private String kullaniciSifre;

    @Column(name = "olusturma_tarihi", nullable = false)
    private Date olusturmaTarihi;
}
