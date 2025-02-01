package com.example.template.TryInit;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@Slf4j
public class ControllerTryInit {
    @PostMapping("/try/init")
    public ResponseEntity<?> getMethodName(@RequestBody EntityRequest entityRequest) {
        log.info("$$$$$ Enter controller");
        EntityResponse entityResponse = new EntityResponse(18, "Happy End");
        return ResponseEntity
                .ok()
                .body(entityResponse);
    }
}
