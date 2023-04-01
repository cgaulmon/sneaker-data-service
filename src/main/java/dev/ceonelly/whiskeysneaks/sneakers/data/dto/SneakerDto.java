package dev.ceonelly.whiskeysneaks.sneakers.data.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode
public class SneakerDto {

    private Long id;
    private String name;
    private Date releaseDate;
    private String description;
    private Double price;
    private String collection;
    private String sku;
    private String nickName;
    private Long brandId;
    private String brandName;
}
