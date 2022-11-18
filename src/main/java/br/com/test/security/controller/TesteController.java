package br.com.test.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteController {


    @GetMapping("ok")
    public ResponseEntity testeOK(){
        return ResponseEntity.ok().body("ok");
    }
    @GetMapping()
    public ResponseEntity teste(){
        return ResponseEntity.ok().body("autenticacao");
    }
}
