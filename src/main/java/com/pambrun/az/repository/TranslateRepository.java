package com.pambrun.az.repository;

import com.pambrun.az.entity.FrenchTranslateEntity;
import com.pambrun.az.entity.TranslateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TranslateRepository
        // Changer ici pour mettre en String ou integer en fonction du Controller et du Entity
        extends JpaRepository<TranslateEntity, Long> {

    List<TranslateEntity> findByLangAndNum(String lang, int num);
}
