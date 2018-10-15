package br.com.toth.blog.controller;

import br.com.toth.blog.model.Autor;
import br.com.toth.blog.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("autor")
public class AutorController {

    private final AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public Flux<Autor> findAll() {
        return autorService.findAll();
    }

    @PostMapping
    public Mono<Autor> insert(@RequestBody Autor autor) {
        return autorService.insert(autor);
    }

}
