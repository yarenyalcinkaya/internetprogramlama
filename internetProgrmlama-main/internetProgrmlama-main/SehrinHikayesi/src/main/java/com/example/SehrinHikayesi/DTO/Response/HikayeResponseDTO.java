package com.example.SehrinHikayesi.DTO.Response;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class HikayeResponseDTO {
    private Long hikayeId;
    private String baslik;
    private String icerik;
    private String konum;
    private Date olusturmaTarihi;
    private String durum;
    private Long kullaniciId;
    private Long onaylayanAdminId;
    private List<String> etiketler;
}
