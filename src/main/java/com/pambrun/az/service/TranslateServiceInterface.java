package com.pambrun.az.service;

import com.pambrun.az.entity.FrenchTranslateEntity;
import com.pambrun.az.entity.TranslateEntity;

public interface TranslateServiceInterface {
    TranslateEntity getTranslation(String lang, int num);
}
