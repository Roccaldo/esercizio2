package com.example.esercizio2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Controller {
    @GetMapping("/ciao/{provincia}")
    public User ciao(
            @PathVariable String provincia,
            @RequestParam String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User(nome, provincia, saluto);
    }
}
