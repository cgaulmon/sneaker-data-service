package dev.ceonelly.whiskeysneaks.sneakers.data.services;

import dev.ceonelly.whiskeysneaks.sneakers.data.repositories.SneakerRepository;
import org.springframework.stereotype.Service;

@Service
public class SneakerService {
    private SneakerRepository sneakerRepository;

    public SneakerService(SneakerRepository sneakerRepository) {
        this.sneakerRepository = sneakerRepository;
    }
}
