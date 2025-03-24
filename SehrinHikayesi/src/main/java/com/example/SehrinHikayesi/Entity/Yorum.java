package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "yorumlar")
public class Yorum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "yorum_id")
    private Long yorumId;

    @Column(name = "icerik", nullable = false)
    private String icerik;

    @Column(name = "olusturma_tarihi", nullable = false)
    private Date olusturmaTarihi;

    @ManyToOne
    @JoinColumn(name = "hikaye_id", nullable = false)
    private Hikaye hikaye;

    @ManyToOne
    @JoinColumn(name = "kullanici_id", nullable = false)
    private Kullanici kullanici;
}
