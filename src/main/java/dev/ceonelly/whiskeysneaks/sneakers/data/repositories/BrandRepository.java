package dev.ceonelly.whiskeysneaks.sneakers.data.repositories;

import dev.ceonelly.whiskeysneaks.sneakers.data.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}