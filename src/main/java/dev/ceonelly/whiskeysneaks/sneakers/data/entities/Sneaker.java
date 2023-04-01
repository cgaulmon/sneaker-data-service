package dev.ceonelly.whiskeysneaks.sneakers.data.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "Sneakers")
public class Sneaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    private String description;
    private Double price;
    private String collection;
    private String sku;
    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "brand_id")
    private Long brandId;
    @Column(name = "brand_name")
    private String brandName;
}
