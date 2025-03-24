package com.example.SehrinHikayesi.DTO.Response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BegenilerResponseDTO {
    private Long begeniId;
    private Long hikayeId;
    private Long kullaniciId;
    private Date olusturmaTarihi;
}
