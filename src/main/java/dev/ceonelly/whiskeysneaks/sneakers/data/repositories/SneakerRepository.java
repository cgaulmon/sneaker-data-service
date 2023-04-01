package dev.ceonelly.whiskeysneaks.sneakers.data.repositories;

import dev.ceonelly.whiskeysneaks.sneakers.data.entities.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
}