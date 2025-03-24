package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "begeniler")
public class Begeniler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "begeni_id")
    private Long begeniId;

    @Column(name = "olusturma_tarihi", nullable = false)
    private Date olusturmaTarihi;

    @ManyToOne
    @JoinColumn(name = "hikaye_id", nullable = false)
    private Hikaye hikaye;

    @ManyToOne
    @JoinColumn(name = "kullanici_id", nullable = false)
    private Kullanici kullanici;
}
