package br.com.toth.blog.service.impl;

import br.com.toth.blog.model.Autor;
import br.com.toth.blog.repository.AutorRepository;
import br.com.toth.blog.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired private AutorRepository autorRepository;

    @Override
    public Mono<Autor> insert(Autor autor) {
        return autorRepository.insert(autor);
    }

    @Override
    public Flux<Autor> findAll() {
        return autorRepository.findAll();
    }
}
