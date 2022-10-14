package com.exercice.translator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslateRepository
        extends CrudRepository<TranslateFrenchEntity, Integer> {// Changer ici pour mettre en String ou integer en fonction du Controller et du Entity
}
