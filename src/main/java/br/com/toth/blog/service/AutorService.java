package br.com.toth.blog.service;

import br.com.toth.blog.model.Autor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AutorService {

    Mono<Autor> insert(Autor autor);

    Flux<Autor> findAll();

}
