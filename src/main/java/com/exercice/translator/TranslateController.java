package com.exercice.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate") // Premier lien après la racine
public class TranslateController {

    @Autowired
    TranslateRepository translateRepository;

    @GetMapping("/fr/{num}") // Deuxième lien qui vient après /translate => translate/{numero}
    TranslateFrenchEntity get(@PathVariable int num) {
        return translateRepository.findById(num).get();
    }

    //@GetMapping("/gr/{num}")
    //TranslateGermanEntity get(int num) {
    //    return translateGerRepository.findById(num).get();
    //}

}
