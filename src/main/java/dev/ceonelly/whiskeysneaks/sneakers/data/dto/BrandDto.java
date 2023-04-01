package dev.ceonelly.whiskeysneaks.sneakers.data.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class BrandDto {

    private Long id;
    private String name;
    private String description;
    private String website;
}
