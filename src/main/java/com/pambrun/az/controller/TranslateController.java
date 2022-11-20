package com.pambrun.az.controller;

import com.pambrun.az.exception.ApiRequestException;
import com.pambrun.az.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@RestController
@RequestMapping("/translate") // Premier lien après la racine
public class TranslateController {

    private final TranslateService translateService;

    @Autowired
    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }

    //http://localhost:8080/translate/8?lang=FR
    @GetMapping(path = "/{nb}")
    public ResponseEntity<String> getFrenchTranslation(
            @PathVariable(name = "nb") int nb,
            @RequestParam("lang") String lang) {

        if (nb < 0 || nb > 30) {
            throw new ApiRequestException("Cela dépasse le range des chiffre existant");
        }
            return ResponseEntity.ok().body(translateService.getTranslation(lang, nb).getTranslation());
    }

}
