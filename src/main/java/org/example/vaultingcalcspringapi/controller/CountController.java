package org.example.vaultingcalcspringapi.controller;

import org.example.vaultingcalcspringapi.model.HorseInput;
import org.example.vaultingcalcspringapi.model.HorseResponse;
import org.example.vaultingcalcspringapi.model.TechResponse;
import org.example.vaultingcalcspringapi.services.ScoreCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.vaultingcalcspringapi.services.StringResolverService;

@RestController
@RequestMapping() // Ajánlott API alapútvonal
public class CountController {

    private final StringResolverService stringResolverService;
    private final ScoreCountService scoreCountService;

    @Autowired
    public CountController(StringResolverService stringResolverService, ScoreCountService scoreCountService) {
        this.stringResolverService = stringResolverService;
        this.scoreCountService = scoreCountService;
    }

    @PostMapping("/techcount")
    public ResponseEntity<TechResponse> StringConvertTo(@RequestBody String input) {
        TechResponse result = stringResolverService.ResolveString(input);
        result = scoreCountService.CalculateTotalTechScore(result,10,1.3,0.9,0.4,0,true);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/horsecount")
    public ResponseEntity<HorseResponse> HorseCountEndpoint(@RequestBody HorseInput input) {
        return ResponseEntity.ok( scoreCountService.HorseScoreCalculate(input))w;
    }

}
