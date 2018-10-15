package br.com.toth.blog.repository;

import br.com.toth.blog.model.Publicacao;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PublicacaoRepository extends ReactiveMongoRepository<Publicacao, String> {

    Flux<Publicacao> findAllBy(Pageable pageable);

}
