package com.pambrun.az.service;

import com.pambrun.az.entity.FrenchTranslateEntity;
import com.pambrun.az.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TranslateService {

    private final TranslateRepository translateRepository;

    @Autowired
    public TranslateService(TranslateRepository translateRepository) {
        this.translateRepository = translateRepository;
    }

    public Optional<FrenchTranslateEntity> getTranslation() {
        return translateRepository.findById(nb, lang);
    }

}
