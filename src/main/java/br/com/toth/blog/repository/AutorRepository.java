package br.com.toth.blog.repository;

import br.com.toth.blog.model.Autor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AutorRepository extends ReactiveMongoRepository<Autor, String> {
}
