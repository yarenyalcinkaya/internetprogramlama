package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "admin_ad", nullable = false)
    private String adminAd;

    @Column(name = "admin_email", nullable = false, unique = true)
    private String adminEmail;

    @Column(name = "admin_sifre", nullable = false)
    private String adminSifre;

    @Column(name = "admin_turu", nullable = false)
    private String adminTuru;
}
