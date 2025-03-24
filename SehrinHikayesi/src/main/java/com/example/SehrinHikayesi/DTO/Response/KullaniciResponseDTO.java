package com.example.SehrinHikayesi.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class KullaniciResponseDTO {
    private Long kullaniciId;
    private String kullaniciAd;
    private String kullaniciEmail;
    private Date olusturmaTarihi;
}
