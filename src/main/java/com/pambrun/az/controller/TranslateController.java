package com.pambrun.az.controller;

import com.pambrun.az.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        return ResponseEntity.ok().body(translateService.getTranslation(nb, lang).getTranslation());
    }

}
