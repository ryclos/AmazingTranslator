package com.pambrun.az.service;

import com.pambrun.az.entity.FrenchTranslateEntity;
import com.pambrun.az.entity.TranslateEntity;
import com.pambrun.az.repository.TranslateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TranslateService implements TranslateServiceInterface {

    private final TranslateRepository translateRepository;

    public TranslateService(TranslateRepository translateRepository) {
        this.translateRepository = translateRepository;
    }

    public TranslateEntity getTranslation(String lang, int num) {
        return translateRepository.findByLangAndNum(lang, num).get(0);
    }

}
