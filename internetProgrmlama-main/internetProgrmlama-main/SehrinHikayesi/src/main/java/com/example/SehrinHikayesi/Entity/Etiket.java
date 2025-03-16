package com.example.SehrinHikayesi.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "etiketler")
public class Etiket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etiket_id")
    private Long etiketId;

    @Column(name = "etiket_adi", nullable = false)
    private String etiketAdi;

    @ManyToMany(mappedBy = "etiketler")
    private List<Hikaye> hikayeler;
}
