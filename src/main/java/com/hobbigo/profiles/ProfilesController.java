package com.hobbigo.profiles;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProfilesController {
    @GetMapping("/")
    ResponseEntity<Map<String, String>> testEndp() {
        return ResponseEntity.ok().body(Map.of("Testowy JSON", "TESTOWY JSON VAL"));
    }
}
