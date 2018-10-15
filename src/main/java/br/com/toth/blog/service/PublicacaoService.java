package br.com.toth.blog.service;

import br.com.toth.blog.model.Publicacao;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;

public interface PublicacaoService {

    Flux<Publicacao> find(Pageable pageable);

}
