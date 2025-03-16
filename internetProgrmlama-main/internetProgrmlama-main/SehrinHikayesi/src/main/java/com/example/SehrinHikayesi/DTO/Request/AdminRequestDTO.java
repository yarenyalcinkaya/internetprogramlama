package com.example.SehrinHikayesi.DTO.Request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminRequestDTO {
    private String adminAd;
    private String adminEmail;
    private String adminSifre;
    private String adminTuru;
}

