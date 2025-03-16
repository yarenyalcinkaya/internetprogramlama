package com.example.SehrinHikayesi.DTO.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HaritaNoktalariResponseDTO {
    private Long noktalarId;
    private double enlem;
    private double boylam;
    private Long hikayeId;
}
