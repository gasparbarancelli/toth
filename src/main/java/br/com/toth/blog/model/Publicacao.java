package br.com.toth.blog.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Publicacao {

    @Id
    private String id;

    private Autor autor;

    private LocalDateTime data;

    private String conteudo;

}
