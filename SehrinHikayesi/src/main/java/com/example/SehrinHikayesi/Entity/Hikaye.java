package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "hikayeler")
public class Hikaye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hikaye_id")
    private Long hikayeId;

    @Column(name = "baslik", nullable = false)
    private String baslik;

    @Column(name = "icerik", nullable = false)
    private String icerik;

    @Column(name = "konum")
    private String konum;

    @Column(name = "olusturma_tarihi", nullable = false)
    private Date olusturmaTarihi;

    @Column(name = "durum")
    private String durum;

    @ManyToOne
    @JoinColumn(name = "kullanici_id", nullable = false)
    private Kullanici kullanici;

    @ManyToOne
    @JoinColumn(name = "onaylayan_admin_id", nullable = false)
    private Admin onaylayanAdmin;

    @ManyToMany
    @JoinTable(
            name = "hikaye_etiket",
            joinColumns = @JoinColumn(name = "hikaye_id"),
            inverseJoinColumns = @JoinColumn(name = "etiket_id")
    )
    private List<Etiket> etiketler;
}
