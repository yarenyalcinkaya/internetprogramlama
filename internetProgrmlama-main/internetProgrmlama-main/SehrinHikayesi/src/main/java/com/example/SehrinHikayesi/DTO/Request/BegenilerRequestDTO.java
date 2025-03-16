package com.example.SehrinHikayesi.DTO.Request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BegenilerRequestDTO {
    private Long hikayeId;
    private Long kullaniciId;
    private Date olusturmaTarihi;
}
