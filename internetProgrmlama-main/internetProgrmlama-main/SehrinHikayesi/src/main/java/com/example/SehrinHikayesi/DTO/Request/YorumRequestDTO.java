package com.example.SehrinHikayesi.DTO.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class YorumRequestDTO {
    private Long hikayeId;
    private Long kullaniciId;
    private String icerik;
}
