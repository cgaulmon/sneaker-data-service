package dev.ceonelly.whiskeysneaks.sneakers.data.services;

import dev.ceonelly.whiskeysneaks.sneakers.data.repositories.BrandRepository;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    private BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
}
