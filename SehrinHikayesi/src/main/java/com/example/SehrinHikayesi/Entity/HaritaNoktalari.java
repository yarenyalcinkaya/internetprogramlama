package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "harita_noktalari")
public class HaritaNoktalari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noktalar_id")
    private Long noktalarId;

    @Column(name = "enlem", nullable = false)
    private double enlem;

    @Column(name = "boylam", nullable = false)
    private double boylam;

    @Column(name = "olusturma_tarihi", nullable = false)
    private Date olusturmaTarihi;

    @ManyToOne
    @JoinColumn(name = "hikaye_id", nullable = false)
    private Hikaye hikaye;
}
