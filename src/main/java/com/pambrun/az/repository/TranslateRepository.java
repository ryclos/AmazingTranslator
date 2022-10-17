package com.pambrun.az.repository;

import com.pambrun.az.entity.FrenchTranslateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TranslateRepository
        // Changer ici pour mettre en String ou integer en fonction du Controller et du Entity
        extends CrudRepository<FrenchTranslateEntity, Integer> {
}
