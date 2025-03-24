package com.example.SehrinHikayesi.DTO.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminResponseDTO {
    private Long adminId;
    private String adminAd;
    private String adminEmail;
    private String adminTuru;
}
