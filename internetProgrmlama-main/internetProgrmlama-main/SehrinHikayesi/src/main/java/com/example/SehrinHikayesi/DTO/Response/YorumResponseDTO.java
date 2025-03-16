package com.example.SehrinHikayesi.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class YorumResponseDTO {
    private Long yorumId;
    private Long hikayeId;
    private Long kullaniciId;
    private String icerik;
    private Date olusturmaTarihi;
}
