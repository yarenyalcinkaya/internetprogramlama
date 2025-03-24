package com.example.SehrinHikayesi.DTO.Request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HikayeRequestDTO {
    private String baslik;
    private String icerik;
    private String konum;
    private Long kullaniciId;
    private Long onaylayanAdminId;
    private List<Long> etiketler;
}
